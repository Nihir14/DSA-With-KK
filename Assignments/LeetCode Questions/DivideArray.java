import java.util.HashMap;
import java.util.Map;

public class DivideArray {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,4,2,3,2,3,3,2,3};
        System.out.println(divideArray(arr));
    }
    public static boolean divideArray(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        for (int count : counter.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
