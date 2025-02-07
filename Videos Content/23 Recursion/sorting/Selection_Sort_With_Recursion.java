package sorting;

public class Selection_Sort_With_Recursion {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr, 0);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void selectionSort(int[] arr, int startIndex) {
        // Base case: if start index reaches end of array
        if (startIndex >= arr.length - 1) {
            return;
        }

        // Find minimum element's index
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // Swap minimum element with first element
        int temp = arr[startIndex];
        arr[startIndex] = arr[minIndex];
        arr[minIndex] = temp;

        // Recursive call on remaining array
        selectionSort(arr, startIndex + 1);
    }
}