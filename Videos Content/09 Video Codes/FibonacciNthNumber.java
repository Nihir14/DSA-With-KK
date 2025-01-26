import java.util.Scanner;

public class FibonacciNthNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int result = 0;
        System.out.println("Enter the Number for fibonacci number series : ");
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        System.out.println("The value of "+n+"th fibonacci number is : "+ result);
    }
}
