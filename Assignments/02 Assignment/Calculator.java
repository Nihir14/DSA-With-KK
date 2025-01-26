// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter opertaor Number : ");
        String oprt = sc.next();

        switch (oprt.charAt(0)) {
            case '+' -> System.out.println("Result : " + (num1 + num2));
            case '-' -> System.out.println("Result : " + (num1 - num2));
            case '*' -> System.out.println("Result : " + (num1 * num2));
            case '/' -> System.out.println("Result : " + (num1 / num2));
            default -> {
            }
        }
    }
}
