public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 77, 99};
        System.out.println(binarySearch(arr, 99, 0, arr.length-1));
    }
    private static int binarySearch(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target) {
            return mid;
        }
        if (target < mid) {
            return binarySearch(arr, target, start, mid-1);
        }
        return binarySearch(arr, target, mid + 1, end);


    }
}
