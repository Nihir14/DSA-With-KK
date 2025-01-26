
import java.util.Scanner;
import javax.naming.spi.DirStateFactory;

// To calculate Fibonacci Series up to n numbers.


public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number upto where u want fibonacci series : ");
        int sln = sc.nextInt();

        long a = 0;
        long b = 1;
        long result = 0;

        for (int i=2;i<sln;i++) {
            if (a==0) {
                System.out.print(0+"\s");
                System.out.print(1+"\s");
            }
            result = a + b;
            a = b;
            b = result;
            System.out.print(result+"\s");
            
        } 
    }
}
