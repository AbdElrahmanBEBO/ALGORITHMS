package lab_1;
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4,3,6,5};
        System.out.println(part(arr));
    }
    public static int part(int[] arr) {
        int pivot = arr[0];
        int pointer = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[pointer];
                arr[pointer] = temp;
                pointer++;
            }
        }

        int temp = arr[0];
        arr[0] = arr[--pointer];
        arr[pointer] = temp;

        return pointer;
    }
}
