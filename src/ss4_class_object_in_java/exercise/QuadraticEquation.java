package ss4_class_object_in_java.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(getDiscriminant())) / 2 * this.a;
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(getDiscriminant())) / 2 * this.a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a : ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter b : ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter c : ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();

        if (delta > 0) {
            double root1 = quadraticEquation.getRoot1();
            double root2 = quadraticEquation.getRoot2();
            System.out.printf("Equation has two root : %.3f %.3f ", root1, root2);
        } else if (delta == 0) {
            double root = quadraticEquation.getRoot1();
            System.out.printf("Equation has one root : %.3f", root);
        } else {
            System.out.print("Equation has no root.");
        }

    }
}