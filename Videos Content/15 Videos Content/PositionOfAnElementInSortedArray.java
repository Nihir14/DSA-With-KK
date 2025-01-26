public class PositionOfAnElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,7,5,55,545,2442,3245,4543,5673};
        int target = 3;
        int ans = findIndices(arr, target);
        System.out.println(ans);
    }

    private static int findIndices(int[] arr, int target) {
        int ans = 0;
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end;
            end = end + (end-start+1)*2;
            start = temp + 1;
        }
        ans = binarySearch(arr, target, start, end);
        return ans;
    }
    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + ((end - start)/2);
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
        }
}
