package ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.controller;

import java.util.Scanner;

public class ManageDataController {
    private static Scanner scanner = new Scanner(System.in);

    public static void menuManageData() {
        System.out.println("------------------------------------------------");
        System.out.println("Chương trình quản lý giảng viên và sinh viên");
        System.out.println("1. Quản lý giảng viên");
        System.out.println("2. Quản lý sinh viên");
        System.out.println("3. Thoát");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                TeacherController.menuTeacher();
                break;
            case 2:
                StudentController.menuStudent();
                break;
            case 3:
                System.exit(0);
        }
    }
}
