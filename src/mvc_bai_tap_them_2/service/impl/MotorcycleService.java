package mvc_bai_tap_them_2.service.impl;

import mvc_bai_tap_them_2.model.Motorcycle;
import mvc_bai_tap_them_2.service.IMotorcycleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorcycleService implements IMotorcycleService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Motorcycle> motorcycleList = new ArrayList<>();

    @Override
    public void addMotorcycle() {
        Motorcycle motorcycle = this.infoMotorcycle();

        System.out.println("Thêm mới thành công");
        motorcycleList.add(motorcycle);

    }

    @Override
    public void displayMotorcycle() {
        for (Motorcycle motorcycle : motorcycleList) {
            System.out.println(motorcycle);
        }
    }

    @Override
    public void removeMotorcycleService(String licensePlateDelete) {
        boolean flagDelete = false;
        for (int i = 0; i < motorcycleList.size(); i++) {
            if (motorcycleList.get(i).getLicensePlate().equals(licensePlateDelete)) {
                System.out.println("Bạn có chắc muốn xóa xe này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    motorcycleList.remove(i);
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
    public void searchMotorcycleService(String licensePlateSearch) {
        boolean flagSearch = false;
        for (int i = 0; i < motorcycleList.size(); i++) {
            if(motorcycleList.get(i).getLicensePlate().contains(licensePlateSearch)){
                flagSearch = true;
                System.out.println(licensePlateSearch);
                break;
            }
        }
        if (!flagSearch){
            System.out.println("Không có phương tiện nào được tìm thấy");
        }
    }


    private Motorcycle infoMotorcycle() {
        System.out.print("Mời bạn nhập biển kiểm soát xe máy : ");
        String licensePlate = scanner.nextLine();
        System.out.print("Mời bạn nhập hãng sản xuất xe máy : ");
        String nameManufacturingCompany = scanner.nextLine();
        System.out.print("Mời bạn nhập năm sản xuất xe máy : ");
        int yearManufacturing = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập chủ sở hữu xe máy : ");
        String owner = scanner.nextLine();
        System.out.print("Mời bạn nhập công suất xe máy : ");
        String wattage = scanner.nextLine();

        Motorcycle motorcycle = new Motorcycle(licensePlate, nameManufacturingCompany, yearManufacturing, owner, wattage);
        return motorcycle;
    }
}
