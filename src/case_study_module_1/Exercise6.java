package case_study_module_1;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter character : ");
        char character = scanner.nextLine().charAt(0);

        switch (character) {
            case 'u':
            case 'U':
            case 'e':
            case 'E':
            case 'o':
            case 'O':
            case 'a':
            case 'A':
            case 'i':
            case 'I':
                System.out.println("Is generator");
                break;
            default:
                System.out.println("Is consonant");
                break;
        }
    }
}
