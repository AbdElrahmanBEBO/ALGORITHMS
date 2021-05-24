package lab_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] arr;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("enter to integer numbers: ");
            int a = scan.nextInt(), b = scan.nextInt();
            arr = new int[a+1][b+1];
            int x = Binomial_rec(a, b);
            int y = Binomial_DB(a, b);
            System.out.println("the result is " + x);
            System.out.println("the result is " + y);
        }
    }
    public static int Binomial_rec(int n,int k){

        if(arr[n][k] != 0) return arr[n][k];

        if(k == 0 || k == n){
            arr[n][k] = 1;
            return arr[n][k];
        }

        arr[n][k] = Binomial_rec(n-1,k-1) + Binomial_rec(n-1,k);

        return arr[n][k];
    }
    public static int Binomial_DB(int n,int k) {
        int[][] arr = new int[n+1][k+1];

        for (int i=0;i<=n;i++){
            for (int j=0;j<=Math.min(i,k);j++) {
                if(j==0 || j==n)
                    arr[i][j] = 1;
                else
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }
        return arr[n][k];
    }
}
