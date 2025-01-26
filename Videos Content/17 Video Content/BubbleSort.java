import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length-1-i; j++) {
                if (arr[j] < arr[j-1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
