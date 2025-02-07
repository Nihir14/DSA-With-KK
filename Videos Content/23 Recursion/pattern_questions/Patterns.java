package pattern_questions;

public class Patterns {
    public static void main(String[] args) {
        pattern_01(5,0);
    }
    private static void pattern_01(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            pattern_01(row, col+1);
            System.out.print("* ");
        } else {
            pattern_01(row-1, 0);
            System.out.println();
        }
    }
}
