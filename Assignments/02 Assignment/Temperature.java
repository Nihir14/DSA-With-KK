import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        
        // Display the result
        System.out.printf("%.2f°C is equal to %.2f°F%n", celsius, fahrenheit);
        
        scanner.close();
    }
}