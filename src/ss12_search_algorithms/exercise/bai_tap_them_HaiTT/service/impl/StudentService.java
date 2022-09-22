package ss12_search_algorithms.exercise.bai_tap_them_HaiTT.service.impl;

import ss12_search_algorithms.exercise.bai_tap_them_HaiTT.model.Student;
import ss12_search_algorithms.exercise.bai_tap_them_HaiTT.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent() {
        Student student = this.infoStudent();

        studentList.add(student);
        System.out.println("Thêm mới thành công");

    }

    @Override
    public void removeStudent() {
        System.out.print("Mời bạn nhập mã học sinh cần xóa: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getCode().equals(code)) {
                System.out.println("Bạn có chắc muốn xóa học sinh này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    studentList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
    }

    @Override
    public void displayStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void searchStudent() {
        System.out.print("Mời bạn nhập tên học sinh cần tìm: ");
        String name = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().contains(name)) {
                System.out.println(studentList.get(i).toString());
                flagDelete = true;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy học sinh cần tìm.");
        }
    }

    private Student infoStudent() {
        System.out.print("Mời bạn nhập mã sinh viên: ");
        String code = scanner.nextLine();
        System.out.print("Mời bạn nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập ngày sinh sinh viên: ");
        int dayOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập giới tính sinh viên: ");
        String gender = scanner.nextLine();
        System.out.print("Mời bạn nhập tên lớp: ");
        String nameClass = scanner.nextLine();
        System.out.print("Mời bạn nhập điểm của học sinh: ");
        double point = Double.parseDouble(scanner.nextLine());
        Student student = new Student(code, name, dayOfBirth, gender, nameClass, point);
        return student;
    }
}
