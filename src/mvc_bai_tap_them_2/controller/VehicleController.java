package mvc_bai_tap_them_2.controller;

import mvc_bai_tap_them_2.service.ICarService;
import mvc_bai_tap_them_2.service.IMotorcycleService;
import mvc_bai_tap_them_2.service.ITruckService;
import mvc_bai_tap_them_2.service.impl.CarService;
import mvc_bai_tap_them_2.service.impl.MotorcycleService;
import mvc_bai_tap_them_2.service.impl.TruckService;

import java.util.Scanner;

public class VehicleController {
    protected static Scanner scanner = new Scanner(System.in);
    protected static ITruckService iTruckService = new TruckService();
    protected static ICarService iCarService = new CarService();
    protected static IMotorcycleService iMotorcycleService = new MotorcycleService();
    public static String licensePlateDelete;
    public static String licensePlateSearch;

    public static void menuManageVehicle() {
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Tìm kiếm theo biển kiểm soát");
            System.out.println("5. Thoát");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    VehicleController.menuAdd();
                    break;
                case 2:
                    VehicleController.menuDisplay();
                    break;
                case 3:
                    System.out.print("Nhập biển kiểm soát bạn muốn xóa : ");
                    licensePlateDelete = scanner.nextLine();
                    iCarService.removeCarService(licensePlateDelete);
                    iMotorcycleService.removeMotorcycleService(licensePlateDelete);
                    iTruckService.removeTruckService(licensePlateDelete);
                    break;
                case 4:
                    System.out.print("Nhập biển kiểm soát bạn cần tìm : ");
                    licensePlateSearch = scanner.nextLine();
                    iCarService.searchCarService(licensePlateSearch);
                    iTruckService.searchTruckService(licensePlateSearch);
                    iMotorcycleService.searchMotorcycleService(licensePlateSearch);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    public static void menuAdd() {
        while (true) {
            System.out.println("Mời bạn chọn phương tiện giao thông muốn thêm vào");
            System.out.println("1. Xe tải");
            System.out.println("2. Xe ô tô");
            System.out.println("3. Xe máy");
            System.out.println("4. Quay về menu chính");

            int choiceAdd = Integer.parseInt(scanner.nextLine());
            switch (choiceAdd) {
                case 1:
                    iTruckService.addTruck();
                    break;
                case 2:
                    iCarService.addCar();
                    break;
                case 3:
                    iMotorcycleService.addMotorcycle();
                    break;
                case 4:
                    return;
            }
        }
    }

    public static void menuDisplay() {
        while (true) {
            System.out.println("Mời bạn chọn loại phương tiện giao thông muốn hiển thị");
            System.out.println("1. Xe tải");
            System.out.println("2. Xe ô tô");
            System.out.println("3. Xe máy");
            System.out.println("4. Quay về menu chính");

            int choiceDisplay = Integer.parseInt(scanner.nextLine());
            switch (choiceDisplay) {
                case 1:
                    iTruckService.displayTruck();
                    break;
                case 2:
                    iCarService.displayCar();
                    break;
                case 3:
                    iMotorcycleService.displayMotorcycle();
                    break;
                case 4:
                    return;
            }
        }
    }
}
