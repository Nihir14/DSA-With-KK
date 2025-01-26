
import java.util.Scanner;

// Take 2 numbers as input and print the largest number.

public class GreatestOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the Second Number : ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Greatest Number is num1 : " + num1);
        }
        else {
            System.out.println("Greatest Number is num2 : " + num2);
        }
    }
}
