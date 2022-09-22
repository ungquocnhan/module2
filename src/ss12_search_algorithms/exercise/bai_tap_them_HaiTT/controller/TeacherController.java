package ss12_search_algorithms.exercise.bai_tap_them_HaiTT.controller;

import ss12_search_algorithms.exercise.bai_tap_them_HaiTT.service.ITeacherService;
import ss12_search_algorithms.exercise.bai_tap_them_HaiTT.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static Scanner scanner = new Scanner(System.in);
    private static ITeacherService iTeacherService = new TeacherService();

    public static void menuTeacher() {
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("Chương trình quản lý giảng viên");
            System.out.println("1. Thêm mới giảng viên");
            System.out.println("2. Xóa giảng viên");
            System.out.println("3. Hiển thị danh sách giảng viên");
            System.out.println("4. Tìm kiếm giảng viên");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.removeTeacher();
                    break;
                case 3:
                    iTeacherService.displayTeacher();
                    break;
                case 4:
                    iTeacherService.searchTeacher();
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }
}
