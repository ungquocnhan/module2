package ss13_sort_algorithms.exercise.bai_tap_them_hatt_phan_sap_xep.controller;

public class SearchStudentController extends StudentController {
    public static void menuSearchStudent() {
        while (true) {
            System.out.println("------------------------------------");
            System.out.println("Tìm kiếm sinh viên");
            System.out.println("1. Tìm kiếm sinh viên theo tên");
            System.out.println("2. Tìm kiếm sinh viên theo id");
            System.out.println("3. Trỏ lại quản lý học sinh");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.searchStudentName();
                    break;
                case 2:
                    iStudentService.searchStudentId();
                    break;
                case 3:
                    return;
            }
        }
    }
}
