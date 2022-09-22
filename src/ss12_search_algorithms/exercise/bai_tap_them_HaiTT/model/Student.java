package ss12_search_algorithms.exercise.bai_tap_them_HaiTT.model;

public class Student extends Person {
    private String nameClass;
    private double point;

    public Student() {
    }

    public Student(String code, String name, int dayOfBirth, String gender, String className, double point) {
        super(code, name, dayOfBirth, gender);
        this.nameClass = className;
        this.point = point;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + nameClass + '\'' +
                ", point=" + point +
                super.toString() +
                '}';
    }

}
