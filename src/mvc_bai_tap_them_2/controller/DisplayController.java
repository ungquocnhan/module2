package mvc_bai_tap_them_2.controller;

public class DisplayController extends VehicleController {

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
