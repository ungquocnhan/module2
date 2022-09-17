package mvc_bai_tap_them_1.service.impl;

import mvc_bai_tap_them_1.model.Teacher;
import mvc_bai_tap_them_1.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();

    @Override
    public void addTeacher() {
        Teacher teacher = this.infoTeacher();

        teacherList.add(teacher);
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
