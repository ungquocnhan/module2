package case_study_furama_resort.src.service.impl;

import case_study_furama_resort.src.model.facility.Facility;
import case_study_furama_resort.src.model.facility.House;
import case_study_furama_resort.src.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();

     @Override
    public void displayListFacility() {

    }

    @Override
    public void addNewVilla() {

    }

    @Override
    public void addNewHouse() {
        House house = this.infoHouse();


    }

    private House infoHouse() {
        System.out.println("Enter name service");
        String nameService = scanner.nextLine();

        System.out.println("Enter area usable");
        double areaUsable = Double.parseDouble(scanner.nextLine());

        System.out.println();
    }

    @Override
    public void addNewRoom() {

    }


    @Override
    public void displayListFacilityMaintenance() {

    }
}
