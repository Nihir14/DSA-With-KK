public class Message {
    public static void main(String[] args) {
        message(5);
    }
    static void message(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Hello World");
        message(n-1);
    }
}
