public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,6,12,18,90};
        int target = 90;
        System.out.println("Available at index No : "+linearSearch(arr,target));

    }
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) return -1;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
