package lab_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class kruskal {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int v = s.nextInt();
        int e = s.nextInt();
        Graph g = new Graph(v, e);
        int a, b, c;
        while (e-- > 0) {
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            g.addEdge(a, b, c);
            
        }
        g.kruskal();
    }
}

class Graph {
    
    int v, e;
    List<Edge> edges;
    int[] dis;
    
    public Graph(int v, int e) {
        this.v = v;
        this.e = e;
        edges = new ArrayList<>();
        dis = new int[v + 1];
        for (int i = 1; i <= v; i++) {
            dis[i] = i;
        }
    }
    
    public int find(int id) {
        return dis[id] = (dis[id] == id ? id : find(dis[id]));
    }
    
    public boolean join(int id1, int id2) {
        id1 = find(id1);
        id2 = find(id2);
        if (id1 == id2) {
            return false;
        }
        dis[id1] = id2;
        return true;
    }
    
    public void addEdge(int a, int b, int c) {
        edges.add(new Edge(a, b, c));
    }
    
    public void kruskal() {
        Collections.sort(edges);
        int sum = 0;
        System.out.println("Kruskal minimum spanning tree");
        for (int i = 0; i < e; i++) {
            int a = edges.get(i).a;
            int b = edges.get(i).b;
            int c = edges.get(i).c;
            if (join(a, b)) {
                System.out.println(a + " " + b + " " + c);
                sum += c;
            }
        }
        System.out.println("Minimumm sapnning tree cost = " + sum);
        
    }
}

class Edge implements Comparable {
    
    int a, b, c;
    
    public Edge(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public int compareTo(Object o) {
        Edge e = (Edge) o;
        if (this.c > e.c) {
            return 1;
        }
        if (this.c < e.c) {
            return -1;
        }
        return 0;
    }
}
