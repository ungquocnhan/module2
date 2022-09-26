package ss14_exception_debug.exercise.bai_tap_them_haitt_phan_ngoai_le.model;

import java.time.LocalDate;

public class Teacher extends Person implements Comparable<Teacher>{
    private String technique;

    public Teacher() {
    }

    public Teacher(String code, String name, LocalDate dayOfBirth, String gender, String technique) {
        super(code, name, dayOfBirth, gender);
        this.technique = technique;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    @Override
    public String toString() {
        return "Teacher{" + "technique='"
                + technique + '\''
                + super.toString() +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        if(this.getName().compareTo(o.getName()) != 0){
            return this.getName().compareTo(o.getName());
        }
        return this.getCode().compareTo(o.getCode());
    }
}
