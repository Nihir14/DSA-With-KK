package level_01_questions;

public class Print_1_N {
    public static void main(String[] args) {
        print(5);
    }

    private static void print(int i) {
        if (i == 0) {
            return;
        }
        print(i-1);
        System.out.println(i);
    }
}
