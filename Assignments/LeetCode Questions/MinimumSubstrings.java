public class MinimumSubstrings {
    static public int partitionString(String s) {
        int[] arr = new int[26];
        for (int i=0; i<s.length(); i++) {
            arr[s.charAt(i) - 97]++;
        }
        int max = 0;
        for (int i=18; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "ssssss";
        System.out.println(partitionString(s));
    }
}
