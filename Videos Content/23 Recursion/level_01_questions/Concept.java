package level_01_questions;

import java.util.Scanner;

public class Concept {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        concept(n);
    }

    private static void concept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
//        concept(n--); It will pass same value and decrement after passing
        concept(--n);
    }
}
