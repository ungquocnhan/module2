package ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.controller;

import ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.service.ITeacherService;
import ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    protected static Scanner scanner = new Scanner(System.in);
    protected static ITeacherService iTeacherService = new TeacherService();

    public static void menuTeacher() {
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("Chương trình quản lý giảng viên");
            System.out.println("1. Thêm mới giảng viên");
            System.out.println("2. Xóa giảng viên");
            System.out.println("3. Hiển thị danh sách giảng viên");
            System.out.println("4. Tìm kiếm giảng viên");
            System.out.println("5. Sắp xếp giảng viên");
            System.out.println("6. Thoát");
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
                    SearchTeacherController.menuSearchTeacher();
                    break;
                case 5:
                    iTeacherService.sortTeacher();
                    break;
                case 6:
                    System.exit(0);
            }

        }
    }
}
