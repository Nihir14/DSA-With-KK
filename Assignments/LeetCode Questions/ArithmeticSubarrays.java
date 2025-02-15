import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarrays {
    static public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList();
        for (int i=0; i<l.length; i++) {
            int length = (r[i]-l[i]);
            int[] arr = new int[length+1];
            for (int k=l[i]; k<=r[i]; k++) {
                arr[k-l[i]] = nums[k];
            }
            Arrays.sort(arr);
            int match = arr[1] - arr[0];
            boolean sumable = true;
            int j=1;
            while (j < arr.length) {
                if ((arr[j] - arr[j-1]) != match) {
                    sumable = false;
                }
                j++;
            }
            ans.add(sumable);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,6,5,9,3,7};
        int[] l = {0,0,2};
        int[] r = {2,3,5};
        System.out.println(checkArithmeticSubarrays(nums, l, r));
    }

}
