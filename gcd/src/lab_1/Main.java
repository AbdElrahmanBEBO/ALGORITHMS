package lab_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(GCD1(10,25)+"\n");
        System.out.println(GCD2(10,25)+"\n");
        System.out.println(GCD3(10,25)+"\n");
    }
    public static int GCD1(int x,int y){
        if(y<x){
            int temp = x;   x = y;  y = temp;
        }
        int res = 0;
        for (int i=1; i<=x ; i++){
            if (y%i == 0 && x%i == 0)
                res = i;
        }
        return res;
    }
    public static int GCD2(int x,int y){
        if(y<x){
            int temp = x;   x = y;  y = temp;
        }
        int res = 0;
        for (int i=x; true ; i--){
            if (y%i == 0 && x%i == 0)
                return i;
        }
    }
    public static int GCD3(int x,int y){
        if(y<x){
            int temp = x;   x = y;  y = temp;
        }

        int r = y%x;

        if(r == 0)
            return x;
        return GCD3(x,r);
    }
}
