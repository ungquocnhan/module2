package ss12_search_algorithms.exercise.bai_tap_them_HaiTT.controller;

import ss12_search_algorithms.exercise.bai_tap_them_HaiTT.service.IStudentService;
import ss12_search_algorithms.exercise.bai_tap_them_HaiTT.service.impl.StudentService;

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
            System.out.println("4. Tìm kiếm sinh viên");
            System.out.println("5. Thoát");
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
                    iStudentService.searchStudent();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
