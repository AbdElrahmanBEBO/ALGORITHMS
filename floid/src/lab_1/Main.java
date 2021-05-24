package lab_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter v: ");
        int v = scan.nextInt();

        System.out.println("Enter E: ");
        int E = scan.nextInt();

        int[][] arr = new int[v][v];
        int[][] P   = new int[v][v];

        for (int i=0 ;  i<E ; i++){
                System.out.printf("path between : ");
                int x = scan.nextInt();
                int y = scan.nextInt();

                int input = scan.nextInt();

                arr[x-1][y-1] = input;
        }

        floid(arr,P);

        System.out.println("\n\n The Shortest path ");

        for (int i=0 ;  i<v ; i++){
            for (int j=0 ; j<v ; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

        int x = 1;
        while(x == -1){
            System.out.println("\n\nthe path ");
            path(scan.nextInt()-1, scan.nextInt()-1, P);

            System.out.print("do you want to continue ");
            x = scan.nextInt();
        }
    }
    public static void path(int q,int r,int[][] P){
        if (P[q][r] != 0){
            path(q,P[q][r],P);
            System.out.print("V"+P[q][r]+"  ");
            path(P[q][r],r,P);
        }
    }
    public static void floid(int[][] arr, int[][] P){
        for (int k=0 ; k<arr.length ; k++){
            for (int i=0 ; i<arr.length ; i++){
                for (int j=0 ; j<arr.length ; j++){

                    if (i!=j && arr[i][j]==0)
                        arr[i][j] = 5000;

                    if (arr[i][k]+arr[k][j]<arr[i][j]){
                        arr[i][j] = (arr[i][j] == 5000) ? -1 : arr[i][k]+arr[k][j];
                        P[i][j] = k;
                    }
                }
            }
        }
    }
}
