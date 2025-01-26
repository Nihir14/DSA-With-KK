public class Patterns_13_14 {
    public static void main(String[] args) {
        pattern_13(5);
        System.out.println();
        pattern_14(5);
        System.out.println();
        pattern_15(5);
    }

    private static void pattern_13(int n) {
        System.out.println("Pattern 13th");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if (j == 1 || j == 2*i-1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void pattern_14(int n) {
        System.out.println("Pattern 14th");
        System.out.println();
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if (j == 1 || j == 2*i-1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void pattern_15(int n) {
        System.out.println("Pattern 15th");
        System.out.println();
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if (j == 1 || j == 2*i-1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            if (i != 1) {
                System.out.println();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if (j == 1 || j == 2*i-1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
