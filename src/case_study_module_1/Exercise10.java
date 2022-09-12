package case_study_module_1;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        String number = scanner.nextLine();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            switch (number.charAt(i)) {
                case '0':
                    str.append("zero");
                    break;
                case '1':
                    str.append("one");
                    break;
                case '2':
                    str.append("two");
                    break;
                case '3':
                    str.append("three");
                    break;
                case '4':
                    str.append("four");
                    break;
                case '5':
                    str.append("five");
                    break;
                case '6':
                    str.append("six");
                    break;
                case '7':
                    str.append("seven");
                    break;
                case '8':
                    str.append("eight");
                    break;
                case '9':
                    str.append("nine");
                    break;
            }
        }
        System.out.print(str + " ");
    }
}
