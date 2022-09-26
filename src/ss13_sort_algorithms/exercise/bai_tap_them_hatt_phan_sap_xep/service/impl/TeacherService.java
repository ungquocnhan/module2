package ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.service.impl;

import ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.model.Teacher;
import ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.service.ITeacherService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();
    private static Teacher teacher5 = new Teacher("T5", "Nhân", 3, "Nam", "Toán");
    private static Teacher teacher1 = new Teacher("T1", "Nhân", 3, "Nam", "Toán");
    private static Teacher teacher2 = new Teacher("T2", "Nhân", 3, "Nam", "Toán");
    private static Teacher teacher3 = new Teacher("T3", "Sang", 3, "Nam", "Toán");
    private static Teacher teacher4 = new Teacher("T6", "Tấn", 3, "Nam", "Toán");
    private static Teacher teacher6 = new Teacher("T4", "Huy", 3, "Nam", "Toán");


    @Override
    public void addTeacher() {
//        Teacher teacher = this.infoTeacher();
//
//        teacherList.add(teacher);
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher6);
        teacherList.add(teacher5);
        teacherList.add(teacher3);
        teacherList.add(teacher4);

        System.out.println("Thêm mới thành công");

    }

    @Override
    public void removeTeacher() {
        System.out.print("Mời bạn nhập mã giảng viên cần xóa: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getCode().equals(code)) {
                System.out.println("Bạn có chắc muốn xóa giảng viên này không? Nhập Y: yes, N: no ");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    teacherList.remove(i);
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
    public void displayTeacher() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void searchTeacherName() {
        System.out.print("Mời bạn nhập tên giảng viên cần tìm: ");
        String name = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getName().contains(name)) {
                System.out.println(teacherList.get(i).toString());
                flagDelete = true;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy giảng viên cần tìm.");
        }
    }

    @Override
    public void searchTeacherId() {
        System.out.print("Mời bạn nhập mã giảng viên cần tìm: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getCode().equals(code)) {
                System.out.println(teacherList.get(i).toString());
                flagDelete = true;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy giảng viên cần tìm.");
        }
    }

    @Override
    public void sortTeacher() {
        for (int i = 1; i < teacherList.size(); i++) {
            Teacher key = teacherList.get(i);
            int j;
            for (j = i - 1; j >= 0 && teacherList.get(j).getName().compareTo(key.getName()) > 0; j--) {
                    teacherList.set(j + 1, teacherList.get(j));
            }
            teacherList.set(j + 1, key);
        }
        displayTeacher();
    }

    private Teacher infoTeacher() {
        System.out.print("Mời bạn nhập mã giảng viên : ");
        String code = scanner.nextLine();
        System.out.print("Mời bạn nhập tên giảng viên : ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập ngày sinh giảng viên: ");
        int dayOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập giới tính giảng viên: ");
        String gender = scanner.nextLine();
        System.out.print("Mời bạn nhập chuyên môn giảng viên: ");
        String technique = scanner.nextLine();
        Teacher teacher = new Teacher(code, name, dayOfBirth, gender, technique);
        return teacher;
    }


}