package ss6_inheritance.exercise.triangle;

import ss6_inheritance.practice.system_of_geometric_object.shape.Shape;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        double halfPeri = (side1+side2+side3)/2;
        return Math.sqrt(halfPeri*(halfPeri - side1)*(halfPeri-side2)*(halfPeri-side3));
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle " + "color " + super.getColor() +String.format("Area = %.2f, Perimeter = %.2f",getArea(),getPerimeter());
    }
}
