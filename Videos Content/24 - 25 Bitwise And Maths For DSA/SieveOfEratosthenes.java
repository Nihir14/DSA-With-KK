public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 100;
        boolean[] arr = new boolean[n+1];
        sieveOfEratosthenes(n, arr);
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                System.out.print(i + " ");
            }
        }
    }
    private static void sieveOfEratosthenes (int n, boolean[] arr) {
        for (int i=2; i*i <= n; i++ ) {
            for (int j = 0; j <= n; j++) {
                if (j % i == 0) {
                    arr[j] = true;
                }
            }
        }
//        for (int i=2; i*i <= n; i++) {
//            if (!arr[i]) {
//                for (int j = i*2; j <= n ; j++) {
//                    arr[j] = true;
//                }
//            }
//        }

    }
}
