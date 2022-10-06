package case_study_furama_resort.src.service.impl;

import case_study_furama_resort.src.model.Booking;
import case_study_furama_resort.src.model.facility.Facility;
import case_study_furama_resort.src.model.person.Customer;
import case_study_furama_resort.src.service.BookingService;
import case_study_furama_resort.src.utils.exception.CheckFormatException;
import case_study_furama_resort.src.utils.read_write_file.ReadFileUtils;
import case_study_furama_resort.src.utils.read_write_file.WriteFileUtils;
import case_study_furama_resort.src.utils.sort.ComparatorDate;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookingServiceImpl implements BookingService {
    private static final String CUSTOMER_CSV = "src\\case_study_furama_resort\\src\\data\\customer.csv";
    private static final String FACILITY_CSV = "src\\case_study_furama_resort\\src\\data\\facility.csv";

    private static final Scanner scanner = new Scanner(System.in);
    private static final Set<Booking> bookingSet = new TreeSet<>(new ComparatorDate());
    private static List<Customer> customerList = new ArrayList<>();
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");



    @Override
    public void addNewBooking() {
        customerList = ReadFileUtils.getAllCustomerFromFile(CUSTOMER_CSV);
        facilityIntegerMap = ReadFileUtils.getAllFacilityFromFile(FACILITY_CSV);
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
        Set<Facility> facilitySet = facilityIntegerMap.keySet();
        for (Facility key : facilitySet) {
            System.out.print(key + " " + facilityIntegerMap.get(key) + "\n");
        }
        Booking booking = this.infoBooking();
        bookingSet.add(booking);
        WriteFileUtils.writeFileFacility(FACILITY_CSV, facilityIntegerMap);
        System.out.println("Enter success");
    }

    private Booking infoBooking() {
        String idBooking = getIdBooking();

        LocalDate dateStart = getDateStart();

        LocalDate dateEnd = getDateEnd();

        String idCustomer = getIdCustomer();

        String idService = getIdService();

        String typeService = getTypeService();

        return new Booking(idBooking, dateStart, dateEnd, idCustomer, idService, typeService);
    }

    private String getTypeService() {
        String typeService;
        while (true) {
            try {
                System.out.print("Enter type service : ");
                typeService = scanner.nextLine();
                CheckFormatException.checkNameService(typeService);
                break;
            } catch (CheckFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return typeService;
    }

    private String getIdService() {
        facilityIntegerMap = ReadFileUtils.getAllFacilityFromFile(FACILITY_CSV);
        String idService;
        while (true) {
            try {
                System.out.print("Enter id service : ");
                idService = scanner.nextLine();
                CheckFormatException.checkIdService(idService);
                boolean flag = false;
                Set<Facility> facilitySet = facilityIntegerMap.keySet();
                for (Facility key : facilitySet) {
                    if (key.getIdService().equals(idService)) {
                        facilityIntegerMap.put(key, facilityIntegerMap.get(key) + 1);
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("Re-enter id service");
                } else {
                    break;
                }
            } catch (CheckFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return idService;
    }

    private String getIdCustomer() {
        customerList = ReadFileUtils.getAllCustomerFromFile(CUSTOMER_CSV);
        String idCustomer;
        while (true) {
            try {
                System.out.print("Enter id customer : ");
                idCustomer = scanner.nextLine();
                CheckFormatException.checkId(idCustomer);
                boolean flag = false;
                for (Customer customer : customerList) {
                    if (customer.getId().equals(idCustomer)) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("Re-enter id customer");
                } else {
                    break;
                }
            } catch (CheckFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return idCustomer;
    }

    private LocalDate getDateEnd() {
        LocalDate dateEnd;
        while (true) {
            try {
                System.out.print("Enter date end : ");
                dateEnd = LocalDate.parse(scanner.nextLine(), formatter);
                break;
            } catch (DateTimeException e) {
                System.out.println(e.getMessage());
            }
        }
        return dateEnd;
    }

    private LocalDate getDateStart() {
        LocalDate dateStart;
        while (true) {
            try {
                System.out.print("Enter date start : ");
                dateStart = LocalDate.parse(scanner.nextLine(), formatter);
                break;
            } catch (DateTimeException e) {
                System.out.println(e.getMessage());
            }
        }
        return dateStart;
    }

    private String getIdBooking() {
        String idBooking;
        while (true) {
            try {
                System.out.println("Enter id follow format FUB-xxx x : 3 number");
                System.out.print("Id booking : ");
                idBooking = scanner.nextLine();
                CheckFormatException.checkId(idBooking);
                boolean flagId = false;
                for (Booking booking : bookingSet) {
                    if (booking.getIdService().equals(idBooking)) {
                        flagId = true;
                        break;
                    }
                }
                if (flagId) {
                    System.out.println("Id duplicates, re-enter");
                } else {
                    break;
                }
            } catch (CheckFormatException e) {
                e.printStackTrace();
            }
        }
        return idBooking;
    }


    @Override
    public void displayListBooking() {
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }

    }

}
