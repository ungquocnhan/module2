package ss2_loop.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size1;
        do {
            System.out.print("Enter a size 1: ");
            size1 = Integer.parseInt(scanner.nextLine());
            if (size1 > 20) {
                System.out.print("Size should not exceed 20");
            }
        } while (size1 > 20);
        int[] array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter element 1" + (i + 1) + ": ");
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array1));


        int size2;
        do {
            System.out.print("Enter a size 2: ");
            size2 = Integer.parseInt(scanner.nextLine());
            if (size2 > 20) {
                System.out.print("Size should not exceed 20");
            }
        } while (size2 > 20);
        int[] array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter element 2" + (i + 1) + ": ");
            array2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array2));

        int[] array3 = new int[size1 + size2];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.println(Arrays.toString(array3));
    }
}
