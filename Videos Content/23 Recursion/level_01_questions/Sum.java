package level_01_questions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = scn.nextInt();
        System.out.println(sum(n));
    }

    private static double sum(int i) {
        if (i <= 1) {
            return 1;
        }
        return sum(i - 1) + i;
    }
}
