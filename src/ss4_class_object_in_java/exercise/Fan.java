package ss4_class_object_in_java.exercise;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }


    public String toString() {
        if (on) {
            return "Fan : " + "speed is " + speed + ", radius is " + radius + ", color is " + color + ", fan is on.";
        } else {
            return "Fan : " + "radius is " + radius + ", color is " + color + ", fan is off.";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        String result1 = fan1.toString();
        System.out.println(result1);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        String result2 = fan2.toString();
        System.out.println(result2);

    }
}
