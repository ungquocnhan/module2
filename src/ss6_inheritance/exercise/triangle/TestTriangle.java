package ss6_inheritance.exercise.triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();

        System.out.print("Enter side1 : ");
        double side1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter side2 : ");
        double side2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter side3 : ");
        double side3 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter color triangle : ");
        String color = scanner.nextLine();
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            if ((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1) {
                triangle.setSide1(side1);
                triangle.setSide2(side2);
                triangle.setSide3(side3);
                triangle.setColor(color);
                System.out.println(triangle.toString());
            } else {
                System.out.println("Is not side of triangle");
            }
        } else {
            System.out.println("Is not side of triangle");
        }
    }
}
