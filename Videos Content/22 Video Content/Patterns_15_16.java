public class Patterns_15_16 {
    public static void main(String[] args) {
        pattern_15(5);
        System.out.println();
        pattern_16(4);
    }

    private static void pattern_15(int n) {
        System.out.println("Pattern 15th");
        System.out.println();
        for (int i = 1; i <= (2*n-1); i++) {
            if (i <= n) {
                for (int j = 1; j <= n-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2*i-1; j++) {
                    if (j == 1 || j == 2*i-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int j = 1; j <= n-i; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            } else {
                for (int j = n; j > (2*n-i); j--) {
                    System.out.print(" ");
                }
                for (int j = 2*(2*n-i)-1; j >= 1; j--) {
                    if (j == 2*(2*n-i)-1 || j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int j = n; j > (2*n-i); j--) {
                    System.out.print(" ");
                }
                System.out.println();
            }

        }
    }

    private static void pattern_16(int n) {
        System.out.println("Pattern 16th");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if (j == 1 || j == 2*i-1) {
                    System.out.print(1);
                } else if (j % 2 == 1){
                    System.out.print(i-1);
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
