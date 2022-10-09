package case_study_furama_resort.src.utils.read_write_file;

import case_study_furama_resort.src.model.Booking;
import case_study_furama_resort.src.model.facility.Facility;
import case_study_furama_resort.src.model.facility.House;
import case_study_furama_resort.src.model.facility.Room;
import case_study_furama_resort.src.model.facility.Villa;
import case_study_furama_resort.src.model.person.Customer;
import case_study_furama_resort.src.model.person.Employee;
import case_study_furama_resort.src.utils.sort.ComparatorDate;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ReadFileUtils {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private static List<String> readFile(String filePath) {
        BufferedReader bufferedReader = null;
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Employee> getAllEmployeeFromFile(String filePath) {
        List<String> stringList = readFile(filePath);
        List<Employee> employeeList = new ArrayList<>();
        try {
            String[] info;
            Employee employee;
            for (String s : stringList) {
                info = s.split(",");
                employee = new Employee();
                employee.setId(info[0]);
                employee.setName(info[1]);
                employee.setDayOfBirth(LocalDate.parse(info[2], formatter));
                employee.setGender(info[3]);
                employee.setNumberIdentityCard(info[4]);
                employee.setNumberPhone(info[5]);
                employee.setEmail(info[6]);
                employee.setLevel(info[7]);
                employee.setPosition(info[8]);
                employee.setSalary(Double.parseDouble(info[9]));
                employeeList.add(employee);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        return employeeList;
    }

    public static List<Customer> getAllCustomerFromFile(String filePath) {
        List<String> stringList = readFile(filePath);
        List<Customer> customerList = new ArrayList<>();
        try {
            String[] info;
            Customer customer;
            for (String s : stringList) {
                info = s.split(";");
                customer = new Customer();
                customer.setId(info[0]);
                customer.setName(info[1]);
                customer.setDayOfBirth(LocalDate.parse(info[2], formatter));
                customer.setGender(info[3]);
                customer.setNumberIdentityCard(info[4]);
                customer.setNumberPhone(info[5]);
                customer.setEmail(info[6]);
                customer.setTypeGuest(info[7]);
                customer.setAddress(info[8]);
                customerList.add(customer);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return customerList;
    }

    public static Map<Facility, Integer> getAllFacilityFromFile(String filePath) {
        List<String> stringList = readFile(filePath);
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        try {
            String[] info;
            Villa villa;
            House house;
            Room room;
            for (String s : stringList) {
                info = s.split(",");
                if (info.length == 10) {
                    villa = new Villa();
                    villa.setNameService(info[0]);
                    villa.setAreaUsable(Double.parseDouble(info[1]));
                    villa.setRentalCosts(Double.parseDouble(info[2]));
                    villa.setMaximumPeople(Integer.parseInt(info[3]));
                    villa.setRentalType(info[4]);
                    villa.setIdService(info[5]);
                    villa.setRoomStandard(info[6]);
                    villa.setAreaSwimmingPool(Double.parseDouble(info[7]));
                    villa.setNumberFloors(Integer.parseInt(info[8]));
                    Integer value = Integer.parseInt(info[9]);
                    facilityIntegerMap.put(villa, value);
                } else if (info.length == 9) {
                    house = new House();
                    house.setNameService(info[0]);
                    house.setAreaUsable(Double.parseDouble(info[1]));
                    house.setRentalCosts(Double.parseDouble(info[2]));
                    house.setMaximumPeople(Integer.parseInt(info[3]));
                    house.setRentalType(info[4]);
                    house.setIdService(info[5]);
                    house.setRoomStandard(info[6]);
                    house.setNumberFloors(Integer.parseInt(info[7]));
                    Integer value = Integer.parseInt(info[8]);
                    facilityIntegerMap.put(house, value);
                } else if (info.length == 8) {
                    room = new Room();
                    room.setNameService(info[0]);
                    room.setAreaUsable(Double.parseDouble(info[1]));
                    room.setRentalCosts(Double.parseDouble(info[2]));
                    room.setMaximumPeople(Integer.parseInt(info[3]));
                    room.setRentalType(info[4]);
                    room.setIdService(info[5]);
                    room.setFreeServiceIncluded(info[6]);
                    Integer value = Integer.parseInt(info[7]);
                    facilityIntegerMap.put(room, value);
                }
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return facilityIntegerMap;
    }

    public static Map<Facility, Integer> getAllFacilityMaintainFromFile(String filePath) {
        List<String> stringList = readFile(filePath);
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        try {
            String[] info;
            Villa villa;
            House house;
            Room room;
            for (String s : stringList) {
                info = s.split(",");
                if (info.length == 10) {
                    villa = new Villa();
                    villa.setNameService(info[0]);
                    villa.setAreaUsable(Double.parseDouble(info[1]));
                    villa.setRentalCosts(Double.parseDouble(info[2]));
                    villa.setMaximumPeople(Integer.parseInt(info[3]));
                    villa.setRentalType(info[4]);
                    villa.setIdService(info[5]);
                    villa.setRoomStandard(info[6]);
                    villa.setAreaSwimmingPool(Double.parseDouble(info[7]));
                    villa.setNumberFloors(Integer.parseInt(info[8]));
                    Integer value = Integer.parseInt(info[9]);
                    facilityIntegerMap.put(villa, value);
                } else if (info.length == 9) {
                    house = new House();
                    house.setNameService(info[0]);
                    house.setAreaUsable(Double.parseDouble(info[1]));
                    house.setRentalCosts(Double.parseDouble(info[2]));
                    house.setMaximumPeople(Integer.parseInt(info[3]));
                    house.setRentalType(info[4]);
                    house.setIdService(info[5]);
                    house.setRoomStandard(info[6]);
                    house.setNumberFloors(Integer.parseInt(info[7]));
                    Integer value = Integer.parseInt(info[8]);
                    facilityIntegerMap.put(house, value);
                } else if (info.length == 8) {
                    room = new Room();
                    room.setNameService(info[0]);
                    room.setAreaUsable(Double.parseDouble(info[1]));
                    room.setRentalCosts(Double.parseDouble(info[2]));
                    room.setMaximumPeople(Integer.parseInt(info[3]));
                    room.setRentalType(info[4]);
                    room.setIdService(info[5]);
                    room.setFreeServiceIncluded(info[6]);
                    Integer value = Integer.parseInt(info[7]);
                    facilityIntegerMap.put(room, value);
                }
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return facilityIntegerMap;
    }

    public static Set<Booking> getAllBookingFromFile(String filePath) {
        List<String> stringList = readFile(filePath);
        Set<Booking> bookingSet = new TreeSet<>(new ComparatorDate());
        try {
            String[] info;
            Booking booking;
            for (String s : stringList) {
                info = s.split(",");
                booking = new Booking();
                booking.setIdBooking(info[0]);
                booking.setDateStart(LocalDate.parse(info[1], formatter));
                booking.setDateEnd(LocalDate.parse(info[2], formatter));
                booking.setIdCustomer(info[3]);
                booking.setIdService(info[4]);
                booking.setTypeService(info[5]);
                bookingSet.add(booking);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return bookingSet;
    }
}
