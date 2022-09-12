package ss6_inheritance.exercise.circle_cylinder.cylinder;

import ss6_inheritance.exercise.circle_cylinder.circle.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return Math.PI * Math.pow(getRadius(),2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder{ "
                + "height = " + height
                + ", volume = " + getVolume()
                + ", which is a subclass of "+ super.toString()+ "}";
    }
}
