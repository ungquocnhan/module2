package ss17_string_regex.exercise.validate_telephone;

import java.util.Scanner;

public class NumberPhone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter telephone : ");
            String numberPhone = scanner.nextLine();
            String regex = "^[(][+][\\d]{2}[)][-][(][0][\\d]{9}[)]$";
            if (numberPhone.matches(regex)) {
                System.out.println("Số điện thoại hợp lệ");
            } else {
                System.out.println("Số điện thoại không hợp lệ");
            }
        }
    }
}



