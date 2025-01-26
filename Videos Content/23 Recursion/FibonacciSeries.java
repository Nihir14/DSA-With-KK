public class FibonacciSeries {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacciSeries(i) + " ");
        }
    }
    private static int fibonacciSeries(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacciSeries(n-1) + fibonacciSeries(n-2);

    }
}
