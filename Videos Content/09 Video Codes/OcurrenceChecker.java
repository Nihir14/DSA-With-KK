

public class OcurrenceChecker {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n = 374567263;
        int count = 0; 
        while (n!=0) {
            if (n % 10 == 7) {
                count++;
            }
            n = n/10;
        }
        System.out.println("Occurence of your number is : "+ count);
    }
}
