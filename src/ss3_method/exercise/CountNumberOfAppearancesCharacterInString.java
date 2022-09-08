package ss3_method.exercise;

import java.util.Scanner;

public class CountNumberOfAppearancesCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "ungquocnhan";

        System.out.print("Enter a character : ");
        char character = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)){
                count++;
            }
        }
        System.out.println("Number of appearances character in string : " + count);
    }
}
