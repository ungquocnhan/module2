package ss2_array_loop.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
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

        System.out.print("Enter number to remove: ");
        int number = Integer.parseInt(scanner.nextLine());

        boolean isExist = false;
        int indexRemove = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                indexRemove = i;
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + number + " in the array.");
        }
        for (int i = indexRemove; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        System.out.println(Arrays.toString(array));
    }
}
