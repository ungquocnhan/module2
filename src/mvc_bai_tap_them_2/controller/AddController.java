package mvc_bai_tap_them_2.controller;


public class AddController extends VehicleController {
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
}
