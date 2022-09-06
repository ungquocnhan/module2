package ss1_introduce_to_java.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter money usd: ");

        double moneyUsd = input.nextDouble();
        double rate = 23535;
        double moneyVnd = moneyUsd * rate;

        System.out.printf("VND : %.2f",moneyVnd);
    }
}
