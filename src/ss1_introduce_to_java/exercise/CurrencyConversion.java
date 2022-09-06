package ss1_introduce_to_java.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter money usd: ");

        double usd = input.nextDouble();
        double rate = 23535;
        double vnd = usd * rate;

        System.out.printf("VND : %.2f",vnd);
    }
}
