import java.util.Arrays;
import java.util.Comparator;

public class DescendingOccurence {
    static public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        int[][] arr = new int[26][2];
        for (int i=0; i<s.length(); i++) {
            arr[s.charAt(i) - 97][0] = s.charAt(i) - 97;
            arr[s.charAt(i) - 97][1]++;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1] != 0) {
                int occ = arr[i][1];
                char ch = (char)(arr[i][0] + 97);
                while (occ > 0) {
                    sb.append("" + ch);
                    occ--;
                }
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "tree";
        s = frequencySort(s);
        System.out.println(s);
    }
}
