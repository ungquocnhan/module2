package ss17_string_regex.exercise.bai_tap_them_haitt_phan_string_regex.model;

import ss15_io_text_file.exercise.bai_tap_them_haitt_phan_doc_file.model.Person;

import java.time.LocalDate;

public class Teacher extends Person implements Comparable<Teacher> {
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
        if (this.getName().compareTo(o.getName()) != 0) {
            return this.getName().compareTo(o.getName());
        }
        return this.getCode().compareTo(o.getCode());
    }
}
