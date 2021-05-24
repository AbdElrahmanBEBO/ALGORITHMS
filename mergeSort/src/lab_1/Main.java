package lab_1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {27,10,12,20,25,13,15,22};

        for (int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+"   ");
        }
        System.out.println();
        mergeSort(arr);

        for (int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+"   ");
        }

    }

    public static void mergeSort(int[] arr){
        if (arr.length<=1){
            return;
        }
        int h = arr.length/2    ,   m = arr.length -h;
        int[] left = Arrays.copyOf(arr,h);
        int[] right = Arrays.copyOfRange(arr,h,arr.length);

        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);
    }
    public static void merge(int[] arr,int[] left,int[] right){
        int i = 0 , j = 0 , k = 0;

        while (i < left.length || j < right.length) {
            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    arr[k++] = left[i++];
                }
                else {
                    arr[k++] = right[j++];
                }
            }
            if (i < left.length){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
    }
}
