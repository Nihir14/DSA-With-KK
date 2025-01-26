
import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King");
            case "Apple" -> System.out.println("Red");
            case "Grapes" -> System.out.println("Bunch");
            case "Orange" -> System.out.println("Circle");
            default -> System.out.println("Invalid Input");
        }
    }
}
