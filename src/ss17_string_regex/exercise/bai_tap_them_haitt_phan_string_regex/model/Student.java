package ss17_string_regex.exercise.bai_tap_them_haitt_phan_string_regex.model;

import ss15_io_text_file.exercise.bai_tap_them_haitt_phan_doc_file.model.Person;

import java.time.LocalDate;

public class Student extends Person implements Comparable<Student> {
    private String nameClass;
    private double point;

    public Student() {
    }

    public Student(String code, String name, LocalDate dayOfBirth, String gender, String className, double point) {
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

    @Override
    public int compareTo(Student o) {
        if(this.getName().compareTo(o.getName()) != 0){
            return this.getName().compareTo(o.getName());
        }
        return this.getCode().compareTo(o.getCode());
    }

}
