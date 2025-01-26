
import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers to check who is largest : ");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();

        if (i1 > 12 && i1 > i3) {
            System.out.println("Largest Number is i1 = " + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("Largest Number is i2 = " + i2);
        } else {
            System.out.println("Largest Number is i3 = " + i3);
        }
    }
}
