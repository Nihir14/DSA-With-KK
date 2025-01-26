
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius of circle : ");
        int radius = sc.nextInt();

        double areaOfCircle = Math.PI * radius * radius;
        System.out.println("Area of circle is : "+ areaOfCircle);
    }
}
