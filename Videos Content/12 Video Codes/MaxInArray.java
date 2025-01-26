import java.util.Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        System.out.println("Max is "+max(arr));
    }

    public static int max(int[] arr) {
        int max= arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
