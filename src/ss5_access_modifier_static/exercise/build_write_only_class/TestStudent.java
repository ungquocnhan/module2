package ss5_access_modifier_static.exercise.build_write_only_class;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setName("Nhan");
        student1.setClasses("C0722G1");
        student1.display();

        Student student2 = new Student();

        student2.setName("Quoc");
        student2.setClasses("C0722G2");
        student2.display();
    }
}
