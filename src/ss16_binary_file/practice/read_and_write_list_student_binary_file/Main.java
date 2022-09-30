package ss16_binary_file.practice.read_and_write_list_student_binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String STUDENT_LIST = "F:/CODEGYM/module_2/src/ss16_binary_file/practice/read_and_write_list_student_binary_file/student.txt";

    static void writeToFile(String path, List<Student> studentList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(studentList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> studentList;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            studentList = (List<Student>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception e) {
            studentList = new ArrayList<>();
        }
        return studentList;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        studentList.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        studentList.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        studentList.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        studentList.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile(STUDENT_LIST, studentList);
        List<Student> studentList1 = readDataFromFile(STUDENT_LIST);
        for (Student student : studentList1) {
            System.out.println(student);
        }
    }
}
