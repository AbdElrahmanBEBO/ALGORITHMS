package lab_1;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {12,34,37,45,57,82,90,120,134};
        System.out.println(binarySearch_rec(arr,120,0,arr.length-1));
    }
    public static int binarySearch_rec(int[] arr,int x,int low,int high){

            int mid = (low + high) / 2;

            if (x == arr[mid])
                return mid;
            else if (x < arr[mid])
                return binarySearch_rec(arr, x, low, mid - 1);
            else
                return binarySearch_rec(arr, x, mid + 1, high);
    }
    public static int binarySearch_ite(int[] arr,int x) {
        int low = 0; int high = arr.length-1;

        while (low<=high){
            int mid = (low+high)/2;

            if (x == arr[mid])
                return mid;
            else if (x < arr[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
}
