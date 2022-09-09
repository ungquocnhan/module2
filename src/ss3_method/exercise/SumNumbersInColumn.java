package ss3_method.exercise;

import java.util.Scanner;

public class SumNumbersInColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = {{3, 6, 4, 7, 1}, {5, 8, 4, 2, 7}, {4, 7, 4, 8, 9}};

        int numColumn;
        System.out.print("Enter column to sum : ");
        numColumn = Integer.parseInt(scanner.nextLine());

        int sum1 = sumNumbers(arr, numColumn);
        System.out.println("Sum column array : " + sum1);

        // Mảng nhập vào.
        System.out.print("Enter row array : ");
        int row = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter column array : ");
        int column = Integer.parseInt(scanner.nextLine());
        int[][] arr1 = new int[row][column];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = (int) (Math.random() * 30);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + ",");
            }
        }
        System.out.println("\n");
        int sum2 = sumNumbers(arr1, numColumn);
        System.out.println("Sum column array : " + sum2);
    }

    static int sumNumbers(int[][] array, int numberColumn) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][numberColumn];
        }
        return sum;
    }
}
