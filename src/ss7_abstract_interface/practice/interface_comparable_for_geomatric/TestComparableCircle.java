package ss7_abstract_interface.practice.interface_comparable_for_geomatric;

import java.util.Arrays;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("indigo",false,3.5);

        System.out.println("Pre-sorted");
        for(ComparableCircle circle:circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted");
        for(ComparableCircle circle:circles){
            System.out.println(circle);
        }
    }
}
