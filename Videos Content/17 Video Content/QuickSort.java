import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];  // Pivot is chosen as the first element
        int left = low + 1;
        int right = high;

        while (left <= right) {
            // Move left pointer until finding an element greater than pivot
            while (left <= right && arr[left] <= pivot) {
                left++;
            }
            // Move right pointer until finding an element smaller than pivot
            while (left <= right && arr[right] > pivot) {
                right--;
            }
            // Swap elements at left and right pointers if they are in the wrong order
            if (left < right) {
                swap(arr, left, right);
            }
        }
        // Swap pivot with right pointer to place it in the correct position
        swap(arr, low, right);
        return right;
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 7, 3, 5, 2, 6};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
