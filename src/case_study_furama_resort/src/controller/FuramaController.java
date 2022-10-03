package case_study_furama_resort.src.controller;

import case_study_furama_resort.src.service.*;
import case_study_furama_resort.src.service.impl.*;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    private static BookingService bookingService = new BookingServiceImpl();
    private static ContractService contractService = new ContractServiceImpl();
    private static CustomerService customerService = new CustomerServiceImpl();
    private static EmployeeService employeeService = new EmployeeServiceImpl();
    private static FacilityService facilityService = new FacilityServiceImpl();
    private static PromotionManagementService promotionManagementService = new PromotionManagementImpl();



    public static void menuManageFuramaResort() {
        while (true) {
            System.out.println("--------------FURAMA RESORT MANAGEMENT--------------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Xin mời bạn chọn : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    FuramaController.menuEmployeeManagement();
                    break;
                case 2:
                    FuramaController.menuCustomerManagement();
                    break;
                case 3:
                    FuramaController.menuFacilityManagement();
                    break;
                case 4:
                    FuramaController.menuBookingManagement();
                    break;
                case 5:
                    FuramaController.menuPromotionManagement();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Mời bạn chọn lại");
                    break;
            }
        }

    }

    private static void menuEmployeeManagement() {
        while (true) {
            System.out.println("--------------Employee Management--------------");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            System.out.print("Xin mời bạn chọn : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeService.displayListEmployees();
                    break;
                case 2:
                    employeeService.addNewEmployee();
                    break;
                case 3:
                    employeeService.editEmployee();
                    break;
                case 4:
                   return;
                default:
                    System.out.println("Mời bạn chọn lại");
                    break;
            }
        }
    }

    private static void menuCustomerManagement() {
        while (true) {
            System.out.println("--------------Customer Management--------------");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            System.out.print("Xin mời bạn chọn : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    customerService.displayListCustomers();
                    break;
                case 2:
                    customerService.addNewCustomer();
                    break;
                case 3:
                    customerService.editCustomer();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Mời bạn chọn lại");
                    break;
            }
        }
    }

    private static void menuFacilityManagement() {
        while (true) {
            System.out.println("--------------Facility Management--------------");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            System.out.print("Xin mời bạn chọn : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    facilityService.displayListFacility();
                    break;
                case 2:
                    facilityService.addNewFacility();
                    break;
                case 3:
                    facilityService.displayListFacilityMaintenance();
                    break;
                case 4:
                   return;
                default:
                    System.out.println("Mời bạn chọn lại");
                    break;
            }
        }
    }

    private static void menuBookingManagement() {
        while (true) {
            System.out.println("--------------Booking Management--------------");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contract");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contract");
            System.out.println("6. Return main menu");
            System.out.print("Xin mời bạn chọn : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    bookingService.addNewBooking();
                    break;
                case 2:
                    bookingService.displayListBooking();
                    break;
                case 3:
                    contractService.createNewContract();
                    break;
                case 4:
                    contractService.displayListContract();
                    break;
                case 5:
                    contractService.editContract();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Mời bạn chọn lại");
                    break;
            }
        }
    }

    private static void menuPromotionManagement() {
        while (true) {
            System.out.println("--------------Promotion Management--------------");
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            System.out.print("Xin mời bạn chọn : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    promotionManagementService.displayListCustomersUseService();
                    break;
                case 2:
                    promotionManagementService.displayListCustomersGetVoucher();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Mời bạn chọn lại");
                    break;
            }
        }
    }
}
