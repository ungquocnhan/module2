package ss1_introduce_to_java.practice;

import java.util.Scanner;

public class UsingTheOperator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area is: " +area);
    }

}



//    public static void main(String[] args) {
//    begin();
//    System.out.println("A");
//    end();
//}
//    static void begin() {
//        System.out.println("B");
//    }
//    static void end() {
//        System.out.println("C");
//    }