package level_01_questions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = scn.nextInt();
        System.out.println(factorial(n));
    }

    private static double factorial(int i) {
        if (i <= 1) {
            return 1;
        }
        return factorial(i - 1) * i;
    }
}
