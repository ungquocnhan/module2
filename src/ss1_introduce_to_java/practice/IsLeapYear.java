package ss1_introduce_to_java.practice;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();

        boolean isLeapYear = false;
        boolean isDivisionBy4 = year % 4 == 0;
        if (isDivisionBy4) {
            boolean isDivisionBy100 = year % 100 == 0;
            if (isDivisionBy100) {
                boolean isDivisionBy400 = year % 400 == 0;
                if (isDivisionBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is not a leap year", year);
        }


//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.printf("%d is a leap year", year);
//                } else {
//                    System.out.printf("%d is not a leap year", year);
//                }
//            } else {
//                System.out.printf("%d is a leap year", year);
//            }
//        } else {
//            System.out.printf("%d is not a leap year", year);
//        }


//        boolean isLeapYear = false;
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    isLeapYear = true;
//                }
//            } else {
//                isLeapYear = true;
//            }
//        }
//
//        if (isLeapYear) {
//            System.out.printf("%d is a leap year", year);
//        } else {
//            System.out.printf("%d is not a leap year", year);
//        }

    }
}
