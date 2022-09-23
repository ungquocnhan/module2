package ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.model;

public abstract class Person {
    private String code;
    private String name;
    private int dayOfBirth;
    private String gender;

    public Person() {
    }

    public Person(String code, String name, int dayOfBirth, String gender) {
        this.code = code;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", gender=" + gender +
                '}';
    }

}
