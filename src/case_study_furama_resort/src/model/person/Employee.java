package case_study_furama_resort.src.model.person;

import java.time.LocalDate;

public class Employee extends Person{
    private String level;
    private String position;
    private Double salary;

    public Employee() {
    }

    public Employee(String id, String name, LocalDate dayOfBirth, Boolean gender, String numberIdentityCard, String numberPhone, String email, String level, String position, Double salary) {
        super(id, name, dayOfBirth, gender, numberIdentityCard, numberPhone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary + super.toString();
    }
}
