package ss7_abstract_interface.exercise.interface_resizeable_for_geomatric.resizeable;


import ss7_abstract_interface.exercise.interface_resizeable_for_geomatric.circle.Circle;
import ss7_abstract_interface.exercise.interface_resizeable_for_geomatric.rectangle.Rectangle;
import ss7_abstract_interface.exercise.interface_resizeable_for_geomatric.shape.Shape;
import ss7_abstract_interface.exercise.interface_resizeable_for_geomatric.square.Square;

public class TestResizeableCircle {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle(3.5, 5.5);
        shapes[2] = new Square(4.5);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("\n");
        for(Shape shape : shapes){
            if(shape instanceof Circle){
                ((Circle) shape).resize(10);
            }else if(shape instanceof Rectangle){
                ((Rectangle) shape).resize(10);
            }else {
                ((Rectangle) shape).resize(10);
            }
            System.out.println(shape);
        }
    }
}
