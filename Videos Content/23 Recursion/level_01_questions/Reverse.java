package level_01_questions;

import java.util.Scanner;

import static java.lang.System.exit;

public class Reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        reverse(n);
    }

    private static void reverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n%10);
        reverse(n/10);

    }
}
