// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal : ");
        double amount = sc.nextDouble();

        System.out.print("Enter Time in years : ");
        double time = sc.nextDouble();

        System.out.print("Enter Rate in percentage : ");
        double rate = sc.nextDouble();

        double perYearInterestAmount = (amount/100)*rate;

        double payableAmount = amount + perYearInterestAmount * time;

        System.out.println("You have to pay " + amount + " + " + time*perYearInterestAmount  + " = " + payableAmount + " in " + time + " years");
    }
}
