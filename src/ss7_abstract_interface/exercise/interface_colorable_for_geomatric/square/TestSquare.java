package ss7_abstract_interface.exercise.interface_colorable_for_geomatric.square;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yellow",true,5.8);
        System.out.println(square);
    }
}
