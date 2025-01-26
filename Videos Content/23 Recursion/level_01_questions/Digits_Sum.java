package level_01_questions;

import java.util.Scanner;

public class Digits_Sum {
    public static void main(String[] args) {
        System.out.println("Enter the Number to add the digits : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(digitSum(n));
    }

    private static int digitSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n%10 + digitSum(n/10);
    }
}
