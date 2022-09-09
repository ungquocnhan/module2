package ss4_class_object_in_java.fan;

import ss4_class_object_in_java.exercise.Fan;

public class Main {
    public static void main(String[] args) {
        ss4_class_object_in_java.exercise.Fan fan1 = new ss4_class_object_in_java.exercise.Fan();
        fan1.turnOn();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        String result1 = fan1.toString();
        System.out.println(result1);

        ss4_class_object_in_java.exercise.Fan fan2 = new Fan();
        fan2.setSpeed(2);
        String result2 = fan2.toString();
        System.out.println(result2);

    }
}
