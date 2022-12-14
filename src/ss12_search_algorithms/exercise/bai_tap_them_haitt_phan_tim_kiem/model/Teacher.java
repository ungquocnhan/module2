package ss12_search_algorithms.exercise.bai_tap_them_haitt_phan_tim_kiem.model;

public class Teacher extends Person {
    private String technique;

    public Teacher() {
    }

    public Teacher(String code, String name, int dayOfBirth, String gender, String technique) {
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
}
