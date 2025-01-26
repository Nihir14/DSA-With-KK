
import java.util.Scanner;

// To find Armstrong Number between two given number.

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start and End Numbers : ");
        int startNum = sc.nextInt();
        int endNum = sc.nextInt();
        
        String listOfArmstrong = ""; 

        for (int i=startNum;i<=endNum;i++) {
            int num = i;
            int sum = 0;
            while (num != 0) {
                int aNum = num % 10;
                num = num/10;
                sum += aNum*aNum*aNum;
            }
            if (sum == i) {
                listOfArmstrong = listOfArmstrong.concat(" "+i);
            }
        }
        System.out.println(listOfArmstrong);
    }
}
