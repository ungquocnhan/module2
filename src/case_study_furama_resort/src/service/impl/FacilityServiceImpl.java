package case_study_furama_resort.src.service.impl;

import case_study_furama_resort.src.model.facility.Facility;
import case_study_furama_resort.src.model.facility.House;
import case_study_furama_resort.src.model.facility.Room;
import case_study_furama_resort.src.model.facility.Villa;
import case_study_furama_resort.src.service.FacilityService;
import case_study_furama_resort.src.utils.exception.CheckFuramaException;
import case_study_furama_resort.src.utils.read_write_file.ReadFileUtils;
import case_study_furama_resort.src.utils.read_write_file.WriteFileUtils;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static final String FACILITY_CSV = "src\\case_study_furama_resort\\src\\data\\facility.csv";
    private static final String MAINTAIN_FACILITY_CSV = "src\\case_study_furama_resort\\src\\data\\maintain_facility.csv";
    private static final Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    @Override
    public void displayListFacility() {
        facilityIntegerMap = ReadFileUtils.getAllFacilityFromFile(FACILITY_CSV);
        Set<Facility> facilitySet = facilityIntegerMap.keySet();
        for (Facility key : facilitySet) {
            System.out.print(key + " " + facilityIntegerMap.get(key) + "\n");
        }

    }

    @Override
    public void addNewVilla() {
        facilityIntegerMap = ReadFileUtils.getAllFacilityFromFile(FACILITY_CSV);
        Villa villa = this.infoVilla();
        facilityIntegerMap.put(villa, 0);
        WriteFileUtils.writeFileFacility(FACILITY_CSV, facilityIntegerMap);
        System.out.println("Enter success");
    }

    private Villa infoVilla() {
        String nameService = getNameService();

        double areaUsable = getAreaUsable();

        double rentalCosts = getRentalCosts();

        int maximumPeople = getMaximumPeople();

        String rentalType = getRentalType();

        String idService = getIdService();

        String roomStandard = getRoomStandardVilla();

        double areaSwimmingPool = getAreaSwimmingPoolVilla();

        int numberFloors = getNumberFloors();

        return new Villa(nameService, areaUsable, rentalCosts, maximumPeople, rentalType, idService, roomStandard, areaSwimmingPool, numberFloors);
    }

    private String getRoomStandardVilla() {
        String roomStandard;
        int choice = 0;
        LOOP:
        while (true) {
            System.out.println("-----------Room Standard-----------");
            System.out.println("1. Villa 1 bedroom");
            System.out.println("2. Villa 2 bedroom");
            System.out.println("3. Villa 3 bedroom");
            try {
                System.out.print("Please choice : ");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            switch (choice) {
                case 1:
                    roomStandard = "Villa 1 bedroom";
                    break LOOP;
                case 2:
                    roomStandard = "Villa 2 bedroom";
                    break LOOP;
                case 3:
                    roomStandard = "Villa 3 bedroom";
                    break LOOP;
                default:
                    System.out.println("Please re-enter 1-3");
                    break;
            }
        }
        return roomStandard;
    }

    private double getAreaSwimmingPoolVilla() {
        double areaSwimmingPool;
        while (true) {
            try {
                System.out.print("Enter area swimming pool m2 : ");
                areaSwimmingPool = Double.parseDouble(scanner.nextLine());
                if (areaSwimmingPool < 30) {
                    System.out.println("Enter area swimming pool bigger 30m2, re-enter ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return areaSwimmingPool;
    }

    @Override
    public void addNewHouse() {
        facilityIntegerMap = ReadFileUtils.getAllFacilityFromFile(FACILITY_CSV);
        House house = this.infoHouse();
        facilityIntegerMap.put(house, 0);
        WriteFileUtils.writeFileFacility(FACILITY_CSV, facilityIntegerMap);
        System.out.println("Enter success");
    }

    private House infoHouse() {
        String nameService = getNameService();

        double areaUsable = getAreaUsable();

        double rentalCosts = getRentalCosts();

        int maximumPeople = getMaximumPeople();

        String rentalType = getRentalType();

        String idService = getIdService();

        String roomStandard = getRoomStandardHouse();

        int numberFloors = getNumberFloors();

        return new House(nameService, areaUsable, rentalCosts, maximumPeople, rentalType, idService, roomStandard, numberFloors);
    }

    private String getNameService() {
        String nameService;
        while (true) {
            try {
                System.out.println("Enter name service follow format Xxxxx... X:A-Z  x:a-z");
                System.out.print("Enter name service : ");
                nameService = scanner.nextLine();
                CheckFuramaException.checkNameService(nameService);
                break;
            } catch (CheckFuramaException e) {
                System.out.println(e.getMessage());
            }
        }
        return nameService;
    }

    private double getAreaUsable() {
        double areaUsable;
        while (true) {
            try {
                System.out.print("Enter area usable : ");
                areaUsable = Double.parseDouble(scanner.nextLine());
                if (areaUsable < 30) {
                    System.out.println("Area usable must bigger 30 m2, re-enter");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return areaUsable;
    }

    private double getRentalCosts() {
        double rentalCosts;
        while (true) {
            try {
                System.out.print("Enter rental costs : ");
                rentalCosts = Double.parseDouble(scanner.nextLine());
                if (rentalCosts < 0) {
                    System.out.println("Rental costs is number positive, re-enter");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return rentalCosts;
    }

    private int getMaximumPeople() {
        int maximumPeople;
        while (true) {
            try {
                System.out.print("Enter maximum people for house : ");
                maximumPeople = Integer.parseInt(scanner.nextLine());
                if (maximumPeople < 0 || maximumPeople > 20) {
                    System.out.println("Maximum people for house from 1 to 19, re-enter");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return maximumPeople;
    }

    private String getRentalType() {
        String rentalType;
        int choice = 0;
        LOOP:
        while (true) {
            System.out.println("-----------Rental Type-----------");
            System.out.println("1. Hours");
            System.out.println("2. Days");
            System.out.println("3. Months");
            System.out.println("4. Years");
            try {
                System.out.print("Please choice : ");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            switch (choice) {
                case 1:
                    rentalType = "Hours";
                    break LOOP;
                case 2:
                    rentalType = "Days";
                    break LOOP;
                case 3:
                    rentalType = "Months";
                    break LOOP;
                case 4:
                    rentalType = "Years";
                    break LOOP;
                default:
                    System.out.println("Please re-enter 1-4");
                    break;
            }
        }
        return rentalType;
    }

    private String getIdService() {
        String idService;
        while (true) {
            try {
                System.out.println("Enter id follow format SVXX-yyyy XX:villa-VL;house-HO;room-RO yyyy: 0-9");
                System.out.print("Enter id service : ");
                idService = scanner.nextLine();
                CheckFuramaException.checkIdService(idService);
                break;
            } catch (CheckFuramaException e) {
                System.out.println(e.getMessage());
            }
        }
        return idService;
    }

    private String getRoomStandardHouse() {
        String roomStandard;
        int choice = 0;
        LOOP:
        while (true) {
            System.out.println("-----------Room Standard-----------");
            System.out.println("1. Suite");
            System.out.println("2. Deluxe");
            System.out.println("3. Superior");
            try {
                System.out.print("Please choice : ");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            switch (choice) {
                case 1:
                    roomStandard = "Suite";
                    break LOOP;
                case 2:
                    roomStandard = "Deluxe";
                    break LOOP;
                case 3:
                    roomStandard = "Superior";
                    break LOOP;
                default:
                    System.out.println("Please re-enter 1-3");
                    break;
            }
        }
        return roomStandard;
    }

    private int getNumberFloors() {
        int numberFloors;
        while (true) {
            try {
                System.out.print("Enter number floors : ");
                numberFloors = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return numberFloors;
    }

    @Override
    public void addNewRoom() {
        facilityIntegerMap = ReadFileUtils.getAllFacilityFromFile(FACILITY_CSV);
        Room room = this.infoRoom();
        facilityIntegerMap.put(room, 0);
        WriteFileUtils.writeFileFacility(FACILITY_CSV, facilityIntegerMap);
        System.out.println("Enter success");

    }

    private Room infoRoom() {

        String nameService = getNameService();

        double areaUsable = getAreaUsable();

        double rentalCosts = getRentalCosts();

        int maximumPeople = getMaximumPeople();

        String rentalType = getRentalType();

        String idService = getIdService();

        String freeServiceIncluded = getFreeServiceIncluded();

        return new Room(nameService, areaUsable, rentalCosts, maximumPeople, rentalType, idService, freeServiceIncluded);
    }

    private String getFreeServiceIncluded() {
        String freeServiceIncluded;
        int choice = 0;
        LOOP:
        while (true) {
            System.out.println("------------Service Free------------");
            System.out.println("1. Breakfast");
            System.out.println("2. Airport shuttle");
            System.out.println("3. Buffet lunch at the restaurant");
            System.out.println("4. Buffet dinner at the restaurant");
            try {
                System.out.print("Please choice : ");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            switch (choice) {
                case 1:
                    freeServiceIncluded = "Breakfast";
                    break LOOP;
                case 2:
                    freeServiceIncluded = "Airport shuttle";
                    break LOOP;
                case 3:
                    freeServiceIncluded = "Buffet lunch at the restaurant";
                    break LOOP;
                case 4:
                    freeServiceIncluded = "Buffet dinner at the restaurant";
                    break LOOP;
                default:
                    System.out.println("Please re-enter 1-4");
                    break;
            }
        }
        return freeServiceIncluded;
    }


    @Override
    public void displayListFacilityMaintenance() {
        facilityIntegerMap = ReadFileUtils.getAllFacilityFromFile(FACILITY_CSV);
        Map<Facility, Integer> maintain = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> key : facilityIntegerMap.entrySet()) {
            if (key.getValue() >= 5) {
                maintain.put(key.getKey(), key.getValue());
            }
        }
        WriteFileUtils.writeFileFacilityMaintain(MAINTAIN_FACILITY_CSV,maintain);
        maintain = ReadFileUtils.getAllFacilityMaintainFromFile(MAINTAIN_FACILITY_CSV);
        Set<Facility> facilitySet = maintain.keySet();
        for (Facility key : facilitySet) {
            System.out.println(key + ":" + maintain.get(key));
        }
    }

    public static String getInfo(Facility facility) {
        if (facility instanceof Villa) {
            return facility.getNameService() + "," + facility.getAreaUsable() + "," + facility.getRentalCosts() + "," + facility.getMaximumPeople() + "," + facility.getRentalType() + "," + facility.getIdService() + "," + ((Villa) facility).getRoomStandard() + "," + ((Villa) facility).getAreaSwimmingPool() + "," + ((Villa) facility).getNumberFloors();
        } else if (facility instanceof House) {
            return facility.getNameService() + "," + facility.getAreaUsable() + "," + facility.getRentalCosts() + "," + facility.getMaximumPeople() + "," + facility.getRentalType() + "," + facility.getIdService() + "," + ((House) facility).getRoomStandard() + "," + ((House) facility).getNumberFloors();
        } else if (facility instanceof Room) {
            return facility.getNameService() + "," + facility.getAreaUsable() + "," + facility.getRentalCosts() + "," + facility.getMaximumPeople() + "," + facility.getRentalType() + "," + facility.getIdService() + "," + ((Room) facility).getFreeServiceIncluded();
        }
        return null;
    }
}
