package ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.controller;

public class SearchTeacherController extends TeacherController {

    public static void menuSearchTeacher() {
        while (true) {
            System.out.println("------------------------------------");
            System.out.println("Tìm kiếm giảng viên");
            System.out.println("1. Tìm kiếm giảng viên theo tên");
            System.out.println("2. Tìm kiếm giảng viên theo id");
            System.out.println("3. Trỏ lại quản lý học sinh");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTeacherService.searchTeacherName();
                    break;
                case 2:
                    iTeacherService.searchTeacherId();
                    break;
                case 3:
                    return;
            }
        }
    }
}
