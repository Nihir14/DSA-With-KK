package leetcode;

public class LeetCode_1095 {
    static int findInMountainArray(int target, MountainArray mountainArr) {
        int ans = -1;
        int start = 0;
        int end = mountainArr.length() - 1;
        int peakElement0 = 0;
        int peakElement1 = 0;

        while (start < end) {
            int mid = start + ((end - start) / 2);
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {

            }
        }
        peakElement0 = start;
        peakElement1 = start;

        start = 0;

        while (start <= peakElement0) {
            int mid = start + (peakElement0 - start) / 2;
            if (target < mountainArr.get(mid)) {
                peakElement0 = mid - 1;
            } else if (target > mountainArr.get(mid)) {
                start = mid + 1;
            } else {
                ans = mid;
                peakElement0 = mid - 1;
            }
        }

        if (ans == -1) {
            end = mountainArr.length() - 1;

            while (peakElement1 <= end) {
                int mid = peakElement1 + (end - peakElement1) / 2;
                if (target > mountainArr.get(mid)) {
                    end = mid - 1;
                } else if (target < mountainArr.get(mid)) {
                    peakElement1 = mid + 1;
                } else {
                    ans = mid;
                    peakElement1 = mid + 1;
                }
            }
        }

        return ans;
    }
}
