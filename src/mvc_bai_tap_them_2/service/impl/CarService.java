package mvc_bai_tap_them_2.service.impl;

import mvc_bai_tap_them_2.model.Car;
import mvc_bai_tap_them_2.service.ICarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Car> carList = new ArrayList<>();

    @Override
    public void addCar() {
        Car car = this.infoCar();

        System.out.println("Thêm mới thành công");
        carList.add(car);

    }

    @Override
    public void displayCar() {
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    @Override
    public void removeCarService(String licensePlateDelete) {
        boolean flagDelete = false;
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getLicensePlate().equals(licensePlateDelete)) {
                System.out.println("Bạn có chắc muốn xóa xe này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    carList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
    }

    @Override
    public void searchCarService(String licensePlateSearch) {
        boolean flagSearch = false;
        for (int i = 0; i < carList.size(); i++) {
            if(carList.get(i).getLicensePlate().contains(licensePlateSearch)){
                flagSearch = true;
                System.out.println(licensePlateSearch);
                break;
            }
        }
        if (!flagSearch){
            System.out.println("Không có phương tiện nào được tìm thấy");
        }
    }

    private Car infoCar() {
        System.out.print("Mời bạn nhập biển kiểm soát xe ô tô : ");
        String licensePlate = scanner.nextLine();
        System.out.print("Mời bạn nhập hãng sản xuất xe ô tô : ");
        String nameManufacturingCompany = scanner.nextLine();
        System.out.print("Mời bạn nhập năm sản xuất xe ô tô : ");
        int yearManufacturing = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập chủ sở hữu xe ô tô : ");
        String owner = scanner.nextLine();
        System.out.print("Mời bạn nhập số chỗ ngồi xe ô tô : ");
        int numberSeats = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập kiểu xe ô tô : ");
        String typeCar = scanner.nextLine();

        Car car = new Car(licensePlate, nameManufacturingCompany, yearManufacturing, owner, numberSeats, typeCar);
        return car;
    }
}
