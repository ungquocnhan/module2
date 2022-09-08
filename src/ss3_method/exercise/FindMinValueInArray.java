package ss3_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Enter a size: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.print("Size should not exceed 20");
            }
        } while (size > 20);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));

        int min = array[0];
        for (int i = 1; i < array.length ; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Min value in array : " + min);
    }
}
