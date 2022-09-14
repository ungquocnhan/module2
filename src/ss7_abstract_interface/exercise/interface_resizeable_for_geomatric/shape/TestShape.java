package ss7_abstract_interface.exercise.interface_resizeable_for_geomatric.shape;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red",false);
        System.out.println(shape);
    }
}
