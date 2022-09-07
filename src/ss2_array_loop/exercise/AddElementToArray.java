package ss2_array_loop.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
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

        System.out.print("Enter number need insert: ");
        int number = Integer.parseInt(scanner.nextLine());

        int indexInsert;
        do {
            System.out.print("Enter position index need insert in array: ");
            indexInsert = Integer.parseInt(scanner.nextLine());
            if (indexInsert <= -1 || indexInsert >= array.length - 1) {
                System.out.println("Don't insert element in array");
            }
        } while (indexInsert <= -1 || indexInsert >= array.length - 1);

        for (int i = array.length - 1; i > indexInsert; i--) {
            array[i] = array[i - 1];
        }
        array[indexInsert] = number;

        System.out.println(Arrays.toString(array));
    }
}
