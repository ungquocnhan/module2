package ss2_loop.practice;

import java.util.Scanner;

public class CalculateLoanInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double money = input.nextDouble();

        System.out.println("Enter number of month: ");
        int month = input.nextInt();

        System.out.println("Enter annual interest ra in percent");
        double interestRate = input.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
