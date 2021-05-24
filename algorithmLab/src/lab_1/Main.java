package lab_1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

/*
        while (true) {
            System.out.println(bRoom(scan.next()));
        }
*/

    }
    public static boolean bRoom(String x){
        System.out.println(x);
        if(x.length()<=1){
            return true;
        }
        if (x.charAt(0)==x.charAt(x.length()-1)) {
            return bRoom(x.substring(1, x.length()-1));
        }
        return false;
    }
}
