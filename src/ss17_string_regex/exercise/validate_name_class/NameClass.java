package ss17_string_regex.exercise.validate_name_class;

import java.util.Scanner;

public class NameClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter name class : ");
            String nameClass = scanner.nextLine();
            String regex = "^[CAP][0-9]{4}[GHIKLM]$";
            if (nameClass.matches(regex)){
                System.out.println("Tên lớp hợp lệ");
            }else {
                System.out.println("Tên lớp không hợp lệ");
            }
        }
    }
}
