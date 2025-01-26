package level_01_questions;

import java.util.Scanner;

public class Digits_Product {
    public static void main(String[] args) {
        System.out.println("Enter the Number to Multiply the digits : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(digitProduct(n));
    }

    private static int digitProduct(int n) {
        if (n <= 1) {
            return 1;
        }
        return n%10 * digitProduct(n/10);
    }
}
