package ss1_introduce_to_java.exercise;

import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");

        int number = input.nextInt();

        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("out of ability");
            }
        } else if (number >= 10 && number < 20) {
            int unit = number % 10;
            switch (unit) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelfth");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }

        } else if (number >= 20 && number < 100) {
            int tens = number / 10;
            int unit = number % 10;
            String stringTens = null;
            String stringUnit = null;
            switch (tens) {
                case 2:
                    stringTens = "twenty";
                    break;
                case 3:
                    stringTens = "thirty";
                    break;
                case 4:
                    stringTens = "forty";
                    break;
                case 5:
                    stringTens = "fifty";
                    break;
                case 6:
                    stringTens = "sixty";
                    break;
                case 7:
                    stringTens = "seventy";
                    break;
                case 8:
                    stringTens = "eighty";
                    break;
                case 9:
                    stringTens = "ninety";
                    break;
            }

            switch (unit) {
                case 1:
                    stringUnit = "one";
                    break;
                case 2:
                    stringUnit = "two";
                    break;
                case 3:
                    stringUnit = "three";
                    break;
                case 4:
                    stringUnit = "four";
                    break;
                case 5:
                    stringUnit = "five";
                    break;
                case 6:
                    stringUnit = "six";
                    break;
                case 7:
                    stringUnit = "seven";
                    break;
                case 8:
                    stringUnit = "eight";
                    break;
                case 9:
                    stringUnit = "nine";
                    break;
            }
            System.out.println(stringTens + " " + stringUnit);
        } else {
            int hundred = number / 100;
            int number1 = number % 100;
            String stringHundred = null;
            int tens = number1 / 10;
            int unit = number1 % 10;

            switch (hundred) {
                case 1:
                    stringHundred = "one hundred";
                    break;
                case 2:
                    stringHundred = "two hundred";
                    break;
                case 3:
                    stringHundred = "three hundred";
                    break;
                case 4:
                    stringHundred = "four hundred";
                    break;
                case 5:
                    stringHundred = "five hundred";
                    break;
                case 6:
                    stringHundred = "six hundred";
                    break;
                case 7:
                    stringHundred = "seven hundred";
                    break;
                case 8:
                    stringHundred = "eight hundred";
                    break;
                case 9:
                    stringHundred = "nine hundred";
                    break;
            }
            if (number1 >= 10 && number1 < 20) {
                int unit1 = number1 % 10;
                String stringUnit1 = "";
                switch (unit1) {
                    case 0:
                        stringUnit1 = "ten";
                        break;
                    case 1:
                        stringUnit1 = "eleven";
                        break;
                    case 2:
                        stringUnit1 = "twelfth";
                        break;
                    case 3:
                        stringUnit1 = "thirteen";
                        break;
                    case 4:
                        stringUnit1 = "fourteen";
                        break;
                    case 5:
                        stringUnit1 = "fifteen";
                        break;
                    case 6:
                        stringUnit1 = "sixteen";
                        break;
                    case 7:
                        stringUnit1 = "seventeen";
                        break;
                    case 8:
                        stringUnit1 = "eighteen";
                        break;
                    case 9:
                        stringUnit1 = "nineteen";
                        break;
                }
                System.out.println(stringHundred + " " + stringUnit1);
            } else {
                String stringTens = "";
                String stringUnit = "";
                switch (tens) {
                    case 2:
                        stringTens = "twenty";
                        break;
                    case 3:
                        stringTens = "thirty";
                        break;
                    case 4:
                        stringTens = "forty";
                        break;
                    case 5:
                        stringTens = "fifty";
                        break;
                    case 6:
                        stringTens = "sixty";
                        break;
                    case 7:
                        stringTens = "seventy";
                        break;
                    case 8:
                        stringTens = "eighty";
                        break;
                    case 9:
                        stringTens = "ninety";
                        break;
                }

                switch (unit) {
                    case 1:
                        stringUnit = "one";
                        break;
                    case 2:
                        stringUnit = "two";
                        break;
                    case 3:
                        stringUnit = "three";
                        break;
                    case 4:
                        stringUnit = "four";
                        break;
                    case 5:
                        stringUnit = "five";
                        break;
                    case 6:
                        stringUnit = "six";
                        break;
                    case 7:
                        stringUnit = "seven";
                        break;
                    case 8:
                        stringUnit = "eight";
                        break;
                    case 9:
                        stringUnit = "nine";
                        break;
                }
                System.out.println(stringHundred + " " + stringTens + " " + stringUnit);
            }
        }
    }
}
