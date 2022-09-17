package mvc_bai_tap_them_1.controller;

import mvc_bai_tap_them_1.service.IStudentService;
import mvc_bai_tap_them_1.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static Scanner scanner = new Scanner(System.in);
    private static IStudentService iStudentService = new StudentService();

    public static void menuStudent() {
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("Chương trình quản lý sinh viên");
            System.out.println("1. Thêm mới  sinh viên");
            System.out.println("2. Xóa giảng sinh viên");
            System.out.println("3. Hiển thị danh sách sinh viên");
            System.out.println("4. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.removeStudent();
                    break;
                case 3:
                    iStudentService.displayStudent();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
