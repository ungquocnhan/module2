package ss7_abstract_interface.exercise.interface_colorable_for_geomatric.colorable;

import ss7_abstract_interface.exercise.interface_colorable_for_geomatric.circle.Circle;
import ss7_abstract_interface.exercise.interface_colorable_for_geomatric.rectangle.Rectangle;
import ss7_abstract_interface.exercise.interface_colorable_for_geomatric.shape.Shape;
import ss7_abstract_interface.exercise.interface_colorable_for_geomatric.square.Square;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle(2.5, 3.5);
        shapes[2] = new Square(4.5);

        for (Shape shape : shapes) {
            System.out.println("Area : " + shape.getArea());
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}
