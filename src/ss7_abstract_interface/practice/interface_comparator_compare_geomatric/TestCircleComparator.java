package ss7_abstract_interface.practice.interface_comparator_compare_geomatric;

import ss6_inheritance.practice.system_of_geometric_object.circle.Circle;

import java.util.Arrays;
import java.util.Comparator;


public class TestCircleComparator {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("indigo", false, 3.5);

        System.out.println("Pre_sorted");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator<Circle> circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
