package ss3_method.exercise;

import java.util.Scanner;

public class SumNumberDiagonalLineMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = {{5, 4, 6}, {1, 5, 5}, {5, 7, 5}};
        int sum1 = sumNumberDiagonalLine(arr);
        System.out.println("Sum number diagonal line matrix : " + sum1);

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
        int sum2 = sumNumberDiagonalLine(arr1);
        System.out.println("Sum number diagonal line matrix : " + sum2);
    }

    static int sumNumberDiagonalLine(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
