package ss7_abstract_interface.practice.interface_comparable_for_geomatric;

import ss6_inheritance.practice.system_of_geometric_object.circle.Circle;

public class ComparableCircle extends Circle
implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }


    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
