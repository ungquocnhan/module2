package ss2_loop.exercise;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle " +
                    "(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Enter length:");
                    int length = Integer.parseInt(input.nextLine());

                    System.out.print("Enter width: ");
                    int width = Integer.parseInt(input.nextLine());

                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }

                    break;
                case 2:
                    System.out.print("Enter length:");
                    int lengthTriangle = Integer.parseInt(input.nextLine());

                    for (int i = 1; i <= lengthTriangle; i++) {
                        for (int j = i; j <= lengthTriangle; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");

                    for (int i = 1; i <= lengthTriangle; i++) {
                        for (int j = 2; j <= i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 5; j >= i; j--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");

                    for (int i = 1; i <= lengthTriangle; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");

                    for (int i = 1; i <= lengthTriangle; i++) {
                        for (int j = 1; j <= lengthTriangle - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.print("Enter length:");
                    int lengthIsoscelesTriangle = Integer.parseInt(input.nextLine());
                    for (int i = 1; i <= lengthIsoscelesTriangle; i++) {
                        for (int j = 1; j <= lengthIsoscelesTriangle - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
