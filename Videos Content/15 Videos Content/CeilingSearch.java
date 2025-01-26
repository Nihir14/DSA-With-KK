public class CeilingSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,67,76,98};
        int target = 7;

        int[] arr1 = {9,8,7,6,4,3,2,1,0};
        int target1 = 5;

        int ans = ceilingSearch(arr, target);
        int ans1 = ceilingSearch(arr1, target1);
        System.out.println(ans);
        System.out.println(ans1);
    }
    static int ceilingSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + ((end-start)/2);
            if (target < arr[mid]) {
                if (arr[0] < arr[arr.length-1]) {
                    end = mid-1;
                } else {
                    start = mid + 1;
                }

            } else if (target > arr[mid]) {
                if (arr[0] > arr[arr.length-1]) {
                    end = mid-1;
                } else {
                    start = mid + 1;
                }
            } else {
                return mid;
            }
        }
    if (arr[0] > arr[arr.length-1]) {
        return end;
    } else {
        return start;
    }
    }
}
