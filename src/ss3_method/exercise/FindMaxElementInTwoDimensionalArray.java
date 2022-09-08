package ss3_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxElementInTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = {{1, 5, 8, 4}, {3, 7, 5, 2}, {9, 3, 6, 1}};
        int max = maxElement(arr);
        System.out.println("Max element in two-dimensional array " + max);


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
        int max1 = maxElement(arr1);
        System.out.println("Max element in two-dimensional array " + max1);
    }

    public static int maxElement(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
