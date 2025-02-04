public class SongsDurationModulo60 {
    public static void main(String[] args) {
        int[] time = {30,20,150,100,40};
        int ans = numPairsDivisibleBy60(time);
        System.out.println(ans);
    }
    public static int numPairsDivisibleBy60(int[] time) {
        int[] arr = new int[60];
        for (int i=0; i<arr.length; i++) {
            arr[time[i] % 60]++;
        }
        int ans = 0;
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if ((arr[i] + arr[j]) % 60 == 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
