package ss14_exception_debug.exercise.use_class_illegaltriangleexception;

import java.util.Scanner;

public class EdgeTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EdgeTriangle triangleEdge = new EdgeTriangle();
        while (true) {
            try {
                System.out.print("Enter edge a : ");
                double edgeA = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter edge b : ");
                double edgeB = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter edge c : ");
                double edgeC = Double.parseDouble(scanner.nextLine());

                try {
                    triangleEdge.checkTriangle(edgeA, edgeB, edgeC);
                } catch (IllegalTriangleException exception) {
                    System.out.println(exception.getMessage());
                }

            } catch (Exception e) {
                System.out.println("Phải là số");

            }
        }
    }

    private void checkTriangle(double edgeA, double edgeB, double edgeC) throws IllegalTriangleException {
        if (edgeA + edgeB > edgeC && edgeB + edgeC > edgeA && edgeC + edgeA > edgeB && edgeA > 0 && edgeB > 0 && edgeC > 0 ) {
            System.out.println("Là cạnh tam giác");
        } else {
            throw new IllegalTriangleException("Không hợp lệ là cạnh tam giác");
        }
    }
}
