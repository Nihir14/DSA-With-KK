import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check case : ");
        char c = sc.next().charAt(0);
        int ch = c;
        if (ch >= 65 && ch <= 90) {
            System.out.println("Entered input Capital Case");
        }
        else {
            System.out.println("Entered input small Case");
        }
    }
}
