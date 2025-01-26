public class Patterns_01_12 {

    public static void main(String[] args) {
        pattern_01(5);
        System.out.println();
        pattern_02(5);
        System.out.println();
        pattern_03(5);
        System.out.println();
        pattern_04(5);
        System.out.println();
        pattern_05(5);
        System.out.println();
        pattern_06(5);
        System.out.println();
        pattern_07(5);
        System.out.println();
        pattern_08(5);
        System.out.println();
        pattern_09(5);
        System.out.println();
        pattern_10(5);
        System.out.println();
        pattern_11(5);
        System.out.println();
        pattern_12(5);

    }

    static void pattern_01(int n) {
        System.out.println("Pattern 1st");
        System.out.println();
        for (int i=0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_02(int n) {
        System.out.println("Pattern 2nd");
        System.out.println();
        for (int i=0; i<n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_03(int n) {
        System.out.println("Pattern 3rd");
        System.out.println();
        for (int i=n; i>=0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_04(int n) {
        System.out.println("Pattern 4th");
        System.out.println();
        for (int i=1; i<=n; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern_05(int n) {
        System.out.println("Pattern 5th");
        System.out.println();
        for (int i=1; i<=(2*n-1); i++) {
            if (i <= n) {
                for (int j = 1; j < i+1; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = (2*n-1)-i; j >= 0; j--) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern_06(int n) {
        System.out.println("Pattern 6th");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pattern_07(int n) {
        System.out.println("Pattern 7th");
        System.out.println();
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pattern_08(int n) {
        System.out.println("Pattern 8th");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern_09(int n) {
        System.out.println("Pattern 9th");
        System.out.println();
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern_10(int n) {
        System.out.println("Pattern 10th");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern_11(int n) {
        System.out.println("Pattern 11th");
        System.out.println();
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern_12(int n) {
        System.out.println("Pattern 12th");
        System.out.println();
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
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
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}

