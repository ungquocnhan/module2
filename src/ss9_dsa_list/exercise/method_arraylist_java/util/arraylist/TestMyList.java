package ss9_dsa_list.exercise.method_arraylist_java.util.arraylist;

public class TestMyList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Huy");
        Student b = new Student(2, "Ngô");
        Student c = new Student(3, "Hoàng");
        Student d = new Student(4, "Trúc");
        Student e = new Student(5, "My");
        Student f = new Student(6, "Ny");
        Student g = new Student(7, "Nhan");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newStudentMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
        studentMyList.add(2, f);
        studentMyList.add(-1, g);

        System.out.println(studentMyList.size());
        System.out.println("--------------------------------");
        for (int i = 0; i < studentMyList.size(); i++) {
            Student student = (Student) studentMyList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
        System.out.println("---------------------------------");
        System.out.println(studentMyList.get(2).getName());

        System.out.println("---------------------------------");
        System.out.println(studentMyList.indexOf(c));

        System.out.println("---------------------------------");
        newStudentMyList = studentMyList.clone();
        Student student = newStudentMyList.remove(1);
        System.out.println(student.getName());

        System.out.println("---------------------------------");
        for (int i = 0; i < newStudentMyList.size(); i++) {
            System.out.println(newStudentMyList.get(i).getName());
        }
    }
}
