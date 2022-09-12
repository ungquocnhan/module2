package ss6_inheritance.exercise.circle_cylinder.cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10,"yellow",10);
        System.out.println(cylinder);

        Cylinder cylinder1 = new Cylinder();
        cylinder1.setRadius(5);
        cylinder1.setHeight(5);
        cylinder1.setColor("blue");
        System.out.println(cylinder1);

    }
}
