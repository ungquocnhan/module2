package case_study_module_1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length : ");
        int length = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == length || j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
