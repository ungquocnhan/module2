package ss7_abstract_interface.exercise.interface_colorable_for_geomatric.rectangle;

import ss7_abstract_interface.exercise.interface_colorable_for_geomatric.colorable.Colorable;
import ss7_abstract_interface.exercise.interface_colorable_for_geomatric.shape.Shape;
import ss7_abstract_interface.exercise.interface_resizeable_for_geomatric.resizeable.Resizeable;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "A Rectangle " + String.format("%.2f, %.2f", getWidth(), getLength())
                + ", which is a subclass of " + super.toString();
    }


}
