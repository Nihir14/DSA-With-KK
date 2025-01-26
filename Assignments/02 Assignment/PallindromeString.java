
import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String for pallindrome check : ");

        String string = sc.next();
        int length = string.length();
        boolean ans = true;

        string = string.toUpperCase();

        System.out.println("You Entered : "+ string);

        for (int i=0; i<length/2;i++) {
            if (string.charAt(i) == string.charAt(length-i-1));
            else {
                ans = false;
            }
        }
        if (ans) {
            System.out.println("String is pallindrome.");
        }
        else {
            System.out.println("String is not pallindrome.");
        }
    }
}
