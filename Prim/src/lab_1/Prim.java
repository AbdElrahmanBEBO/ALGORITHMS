package lab_1;

import java.util.Scanner;

public class Prim {

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

            g.W[a][b] = c;
            g.W[b][a] = c;
        }
        g.prim();
    }
}

class Graph {

    int v, e;
    int[][] W;

    public Graph(int v, int e) {
        this.v = v;
        this.e = e;

        W = new int[v + 1][v + 1];

        for (int i = 1; i < v + 1; i++) {
            for (int j = 1; j < v + 1; j++) {
                W[i][j] = 5000;
            }
            W[i][i] = 0;
        }
    }

    public void prim() {
        int vnear , min;
        int n = 1;

        int[] nearest  = new int[v + 1];
        int[] distance = new int[v + 1];

        for (int i = 2; i < v+1 ; i++) {
            nearest[i] = 1;
            distance[i] = W[1][i];
        }

        while (n++ < v) {
            vnear = 5000;
            min   = 5000;

            for (int i = 2; i < v+1 ; i++) {
                if (distance[i] > 0 && distance[i] < min) {
                    min = distance[i];
                    vnear = i;
                    System.out.println(distance[i]+"     "+vnear);
                }
            }
            distance[vnear] = 0;

            for (int i = 2; i < v+1 ; i++) {
                if (W[vnear][i] < distance[i]) {
                    nearest[i] = vnear;
                    distance[i] = W[vnear][i];
                    System.out.println(nearest[i]+"&&&&&"+distance[i]);
                }
            }
        }
        printMSP(distance);
    }

    public void printMSP(int[] a) {
        int sum = 0;
        for (int i = 2; i < a.length; i++)
            sum += a[i];

        System.out.println("the minimum spanning tree weihgt = " + sum);

    }
}

/* input test
5 7
1 2 1
1 3 3
2 3 3
2 4 6
3 4 4
3 5 2
4 5 5
*/