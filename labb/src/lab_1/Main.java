package lab_1;

public class Main {

    public static void main(String[] args) {
        int[] x = {1,2,3,77,4,5};
        System.out.println(maxNum(x,0,x.length-1));
    }

    public static int maxNum(int[] arr,int low,int high){

        int mid = (low+high)/2;

        if (low == high)
            return arr[low];

          return Math.max(maxNum(arr,mid+1,high),maxNum(arr,low,mid));
//  OR    return maxNum(arr,mid+1,high) >= maxNum(arr,low,mid) ? maxNum(arr,mid+1,high) : maxNum(arr,low,mid);

    }
}
