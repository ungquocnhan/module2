package case_study_module_1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length : ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter width : ");
        int width = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == length || j == 1 | j == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
