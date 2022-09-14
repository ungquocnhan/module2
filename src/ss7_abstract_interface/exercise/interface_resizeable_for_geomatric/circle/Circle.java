package ss7_abstract_interface.exercise.interface_resizeable_for_geomatric.circle;

import ss7_abstract_interface.exercise.interface_resizeable_for_geomatric.resizeable.Resizeable;
import ss7_abstract_interface.exercise.interface_resizeable_for_geomatric.shape.Shape;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle " + String.format("%.2f, %.2f, %.2f", getRadius(), getArea(), getPerimeter())
                + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double persent) {
        this.radius += persent / 100 * this.radius;
    }
}
