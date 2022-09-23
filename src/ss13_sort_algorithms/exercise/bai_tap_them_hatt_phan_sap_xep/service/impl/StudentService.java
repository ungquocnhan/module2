package ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.service.impl;

import ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.model.Student;
import ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.model.Teacher;
import ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.service.IStudentService;

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
    public void searchStudentName() {
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

    @Override
    public void searchStudentId() {
        System.out.print("Mời bạn nhập mã học sinh cần tìm: ");
        String code = scanner.nextLine();
        boolean flagSearch = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getCode().equals(code)) {
                System.out.println(studentList.get(i).toString());
                flagSearch = true;
            }
        }
        if (!flagSearch) {
            System.out.println("Không tìm thấy học sinh cần tìm.");
        }
    }

    @Override
    public void sortStudent() {
        for (int i = 1; i < studentList.size(); i++) {
            Student key = studentList.get(i);
            int j;
            for (j = i - 1; j >= 0 && studentList.get(j).getName().compareTo(key.getName()) > 0; j--) {
                studentList.set(j + 1, studentList.get(j));
            }
            studentList.set(j + 1, key);
        }
        displayStudent();
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
