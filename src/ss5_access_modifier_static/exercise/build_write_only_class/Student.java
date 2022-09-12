package ss5_access_modifier_static.exercise.build_write_only_class;

public class Student {
    private String name;
    private String classes;

    public Student() {
    }

    void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void display(){
        System.out.println(this.name + " " + this.classes);
    }
}
