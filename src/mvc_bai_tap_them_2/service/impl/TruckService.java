package mvc_bai_tap_them_2.service.impl;

import mvc_bai_tap_them_2.model.Truck;
import mvc_bai_tap_them_2.service.ITruckService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Truck> truckList = new ArrayList<>();

    @Override
    public void addTruck() {
        Truck truck = this.infoTruck();

        System.out.println("Thêm mới thành công");
        truckList.add(truck);
    }

    @Override
    public void displayTruck() {
        for (Truck truck : truckList) {
            System.out.println(truck);
        }
    }

    @Override
    public void removeTruckService(String licensePlateDelete) {
        boolean flagDelete = false;
        for (int i = 0; i < truckList.size(); i++) {
            if (truckList.get(i).getLicensePlate().equals(licensePlateDelete)) {
                System.out.println("Bạn có chắc muốn xóa xe này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    truckList.remove(i);
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
    public void searchTruckService(String licensePlateSearch) {
        boolean flagSearch = false;
        for (int i = 0; i < truckList.size(); i++) {
            if(truckList.get(i).getLicensePlate().contains(licensePlateSearch)){
                flagSearch = true;
                System.out.println(licensePlateSearch);
                break;
            }
        }
        if (!flagSearch){
            System.out.println("Không có phương tiện nào được tìm thấy");
        }
    }

    private Truck infoTruck() {
        System.out.print("Mời bạn nhập biển kiểm soát xe tải : ");
        String licensePlate = scanner.nextLine();
        System.out.print("Mời bạn nhập hãng sản xuất xe tải : ");
        String nameManufacturingCompany = scanner.nextLine();
        System.out.print("Mời bạn nhập năm sản xuất xe tải : ");
        int yearManufacturing = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập chủ sở hữu xe tải : ");
        String owner = scanner.nextLine();
        System.out.print("Mời bạn nhập tải trọng xe tải : ");
        String tonnage = scanner.nextLine();

        Truck truck = new Truck(licensePlate, nameManufacturingCompany, yearManufacturing, owner, tonnage);
        return truck;
    }
}
