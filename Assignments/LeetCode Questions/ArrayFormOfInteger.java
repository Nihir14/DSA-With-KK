import java.util.ArrayList;
import java.util.List;

public class ArrayFormOfInteger {
    public static void main(String[] args) {
        int[] arr = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        System.out.println(addToArrayForm(arr, 516));
    }
    static public List<Integer> addToArrayForm(int[] num, int k) {
        double sum = 0;
        for (int i=0; i<num.length; i++) {
            sum = (sum*10) + num[i];
        }
        sum = sum + k;
        int digit = 0;
        List<Integer> ans = new ArrayList<Integer>(num.length);
        double dup = sum;
        int i = 0;
        while (dup > 0) {
            ans.add(0);
            dup /= 10;
            i++;
        }

        while (sum > 0) {
            digit = (int)(sum % 10);
            sum /= 10;
            ans.set(i-1, digit);
            i--;
        }
        return ans;
    }
}
