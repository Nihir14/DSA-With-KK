import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        for (int i = 1; i < 51; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }

    private static boolean isPrime(int i) {
        if (i <= 1) {
            return false;
        }
        int c = 2;
        while (c*c <= i) {
            if (i % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
