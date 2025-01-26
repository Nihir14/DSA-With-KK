import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of triangle : ");
        int base = sc.nextInt();
        System.out.print("Enter height of triangle : ");  
        int height = sc.nextInt();

        double areaOfCircle = 0.5 * base * height;
        System.out.println("Area of circle is : "+ areaOfCircle);
    }
}
