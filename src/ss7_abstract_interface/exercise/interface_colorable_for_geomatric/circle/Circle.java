package ss7_abstract_interface.exercise.interface_colorable_for_geomatric.circle;

import ss7_abstract_interface.exercise.interface_colorable_for_geomatric.colorable.Colorable;
import ss7_abstract_interface.exercise.interface_colorable_for_geomatric.shape.Shape;
import ss7_abstract_interface.exercise.interface_resizeable_for_geomatric.resizeable.Resizeable;

public class Circle extends Shape{
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
        return "A Circle " + String.format("%.2f", getRadius())
                + ", which is a subclass of " + super.toString();
    }

}
