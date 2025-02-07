package sorting;

import java.util.Arrays;

public class Bubble_Sort_With_Recursion {
    public static void main(String[] args) {
        int[] arr = {213,343,223,2232,33,23,232,2,4,4,9};
        System.out.println(Arrays.toString(arr));
        bubbleSortWithRecusion(arr,1,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSortWithRecusion(int[] arr,int start, int end) {
        if (end <= 0) {
            return;
        }
        if (start < end) {
            if (arr[start-1] > arr[start]) {
                int temp = arr[start-1];
                arr[start-1] = arr[start];
                arr[start] = temp;
            }
            bubbleSortWithRecusion(arr, start+1, end);
        } else {
            bubbleSortWithRecusion(arr, 1, end-1);
        }
    }
}
