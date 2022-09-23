package ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.controller;

import ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.service.IStudentService;
import ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    protected static Scanner scanner = new Scanner(System.in);
    protected static IStudentService iStudentService = new StudentService();

    public static void menuStudent() {
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("Chương trình quản lý sinh viên");
            System.out.println("1. Thêm mới  sinh viên");
            System.out.println("2. Xóa giảng sinh viên");
            System.out.println("3. Hiển thị danh sách sinh viên");
            System.out.println("4. Tìm kiếm sinh viên");
            System.out.println("5. Sắp xếp sinh viên");
            System.out.println("6. Trở lại");
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
                    SearchStudentController.menuSearchStudent();
                    break;
                case 5:
                    iStudentService.sortStudent();
                    break;
                case 6:
                    return;
            }
        }
    }
}
