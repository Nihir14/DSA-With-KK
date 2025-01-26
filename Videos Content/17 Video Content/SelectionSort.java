import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
//        int[] arr = {2,3,4,5,6,7,8};
        int[] arr1 = {4,2,3,4,676,43,31,234};
//        bubbleSort(arr);
        selectionSort(arr1);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    private static void selectionSort(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            int last = arr1.length - i - 1;
            int maxIndex = maxIndex(arr1, 0, last);
            swap(arr1, maxIndex, last);
        }
    }

    private static void swap(int[] arr1, int maxIndex, int last) {
        int temp = arr1[maxIndex];
        arr1[maxIndex] = arr1[last];
        arr1[last] = temp;
    }

    private static int maxIndex(int[] arr1, int i, int last) {
        int max = 0;
        for (int j = i; j <= last; j++) {
            if (arr1[max] < arr1[j]) {
                max = j;
            }
        }
        return max;
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
