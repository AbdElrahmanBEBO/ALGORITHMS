package lab_1;

public class Main {

    public static void main(String[] args) {
        System.out.println(fib(10));
    }
    public static int fib(int x){
        int[] arr = new int[x+1];
        arr[0] = 0 ; arr[1] = 1;

        for (int i=2 ; i<=x ; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[x];
    }
}
