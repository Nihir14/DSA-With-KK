import java.util.Scanner;

public class PrimeNumbersTillNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
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
