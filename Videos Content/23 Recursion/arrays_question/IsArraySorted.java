package arrays_question;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,4,5,6,7};
        System.out.println(isSorted(arr, 0));
    }
    private static boolean isSorted(int[] arr, int start) {
        if (start < arr.length-1) {
            return true;
        }
        if (arr[start] > arr[start+1]) {
            return false;
        }
        return isSorted(arr, start+1);
    }
}
