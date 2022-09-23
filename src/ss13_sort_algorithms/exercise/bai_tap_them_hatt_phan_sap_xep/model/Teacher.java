package ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.model;

public class Teacher extends Person implements Comparable<Teacher>{
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

    @Override
    public int compareTo(Teacher o) {
        if(this.getName().compareTo(o.getName()) != 0){
            return this.getName().compareTo(o.getName());
        }
        return this.getCode().compareTo(o.getCode());
    }
}
