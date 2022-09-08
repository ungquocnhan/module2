package ss3_method.practice;

import java.util.Arrays;
import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter size student : ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }
        } while (size > 30);

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter point student : " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int count = 0;
        System.out.print("List of mark: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if (array[i] > 5 && array[i] < 10) {
                count++;
            }
        }
        System.out.println("Student pass : " + count);
    }
}
