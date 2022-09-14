package ss7_abstract_interface.exercise.interface_colorable_for_geomatric.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo",false,3.5);
        System.out.println(circle);
    }
}
