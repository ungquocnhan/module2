package case_study_furama_resort.src.service.impl;

import case_study_furama_resort.src.model.person.Customer;
import case_study_furama_resort.src.service.CustomerService;
import case_study_furama_resort.src.utils.exception.CheckFormatException;
import case_study_furama_resort.src.utils.read_write_file.ReadFileUtils;
import case_study_furama_resort.src.utils.read_write_file.WriteFileUtils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static final String CUSTOMER_CSV = "src\\case_study_furama_resort\\src\\data\\customer.csv";
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> customerList = new LinkedList<>();
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public void displayListCustomers() {
        customerList = ReadFileUtils.getAllCustomerFromFile(CUSTOMER_CSV);
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addNewCustomer() {
        customerList = ReadFileUtils.getAllCustomerFromFile(CUSTOMER_CSV);
        Customer customer = this.infoCustomer();
        customerList.add(customer);
        WriteFileUtils.writeFileCustomer(CUSTOMER_CSV, customerList);
        System.out.println("Enter success");
    }

    private Customer infoCustomer() {
        String id = getIdCustomer();

        String name = getNameCustomer();

        LocalDate dayOfBirth = getDateCustomer();

        String gender = getGenderCustomer();

        String numberIdentityCard = getNumberIdentityCardCustomer();

        String numberPhone = getNumberPhoneCustomer();

        String email = getEmailCustomer();

        String typeGuest = getTypeGuest();

        String address = getAddress();

        Customer customer = new Customer(id, name, dayOfBirth, gender, numberIdentityCard, numberPhone, email, typeGuest, address);
        return customer;
    }

    private String getAddress() {
        String address;
        while (true) {
            try {
                System.out.println();
                System.out.print("Enter address customer : ");
                address = scanner.nextLine();
                CheckFormatException.checkAddress(address);
                break;
            } catch (CheckFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return address;
    }

    private String getTypeGuest() {
        String typeGuest;
        int choiceTypeGuest = 0;
        LOOP:
        while (true) {
            System.out.println("1. Member");
            System.out.println("2. Silver");
            System.out.println("3. Gold");
            System.out.println("4. Platinium");
            System.out.println("5. Diamond");
            System.out.print("Enter type guest : ");
            try {
                choiceTypeGuest = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            switch (choiceTypeGuest) {
                case 1:
                    typeGuest = "Member";
                    break LOOP;
                case 2:
                    typeGuest = "Silver";
                    break LOOP;
                case 3:
                    typeGuest = "Gold";
                    break LOOP;
                case 4:
                    typeGuest = "Platinium";
                    break LOOP;
                case 5:
                    typeGuest = "Diamond";
                    break LOOP;
                default:
                    System.out.println("Enter repeat 1 - 5");
                    break;
            }
        }
        return typeGuest;
    }

    private String getEmailCustomer() {
        String email;
        while (true) {
            try {
                System.out.print("Enter email : ");
                email = scanner.nextLine();
                CheckFormatException.checkEmail(email);
                break;
            } catch (CheckFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return email;
    }

    private String getNumberPhoneCustomer() {
        String numberPhone;
        while (true) {
            try {
                System.out.println("Enter munber phone follow format +xx-xxxxxxxxxx  x: 2-6;0;9 number");
                System.out.print("Enter number phone : ");
                numberPhone = scanner.nextLine();
                CheckFormatException.checkNumberPhone(numberPhone);
                break;
            } catch (CheckFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return numberPhone;
    }

    private String getIdCustomer() {
        String id;
        while (true) {
            try {
                System.out.println("Enter id follow format FUC-000");
                System.out.print("Id customer : ");
                id = scanner.nextLine();
                CheckFormatException.checkId(id);
                boolean flagId = false;
                for (Customer customer : customerList) {
                    if (customer.getId().equals(id)) {
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
        return id;
    }

    private String getNameCustomer() {
        String name;
        while (true) {
            try {
                System.out.print("Enter name customer : ");
                name = scanner.nextLine();
                CheckFormatException.checkName(name);
                break;
            } catch (CheckFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    private LocalDate getDateCustomer() {
        LocalDate dayOfBirth;
        LocalDate now;
        while (true) {
            try {
                System.out.print("Enter day of birth employee : ");
                dayOfBirth = LocalDate.parse(scanner.nextLine(), formatter);
                now = LocalDate.now();
                Period checkAge = Period.between(dayOfBirth, now);
                if (checkAge.getYears() < 18 || checkAge.getYears() > 100) {
                    System.out.println("You are not enough age or too old to register service");
                }
                else {
                    break;
                }
            } catch (DateTimeException e) {
                System.out.println("Enter incorrect format of day, re-enter");
            }
        }
        return dayOfBirth;
    }

    private String getGenderCustomer() {
        String gender;
        int choiceGender = 0;
        LOOP:
        while (true) {
            System.out.println("1. Male");
            System.out.println("2. Female");
            System.out.println("3. LGBT");
            System.out.print("Enter choice gender : ");

            try {
                choiceGender = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            switch (choiceGender) {
                case 1:
                    gender = "Male";
                    break LOOP;
                case 2:
                    gender = "Female";
                    break LOOP;
                case 3:
                    gender = "LGBT";
                    break LOOP;
                default:
                    System.out.println("Enter repeat 1 - 3");
                    break;
            }
        }
        return gender;
    }

    private String getNumberIdentityCardCustomer() {
        String numberIdentityCard;
        while (true) {
            try {
                System.out.println("Enter number identity card follow format xxxxxxxxxxxx  x: 9-12 number");
                System.out.print("Enter number identity card : ");
                numberIdentityCard = scanner.nextLine();
                CheckFormatException.checkNumberIdentityCard(numberIdentityCard);
                boolean flagCheck = false;
                for (Customer customer : customerList) {
                    if (customer.getNumberIdentityCard().equals(numberIdentityCard)) {
                        flagCheck = true;
                        break;
                    }
                }
                if (flagCheck) {
                    System.out.println("Number Identity card duplicates, re-enter");
                } else {
                    break;
                }
            } catch (CheckFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return numberIdentityCard;
    }

    @Override
    public void editCustomer() {
        customerList = ReadFileUtils.getAllCustomerFromFile(CUSTOMER_CSV);
        System.out.print("Enter id customer edit : ");
        String id = scanner.nextLine();
        boolean flagDelete = false;
        String nameEdit;
        LocalDate dayOfBirthEdit;
        String genderEdit;
        String numberIdentityCardEdit;
        String numberPhoneEdit;
        String emailEdit;
        String typeGuestEdit;
        String addressEdit;
        int choice = 0;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(id)) {
                LOOP:
                while (true) {
                    System.out.println("Menu Edit");
                    System.out.println("1. Edit name");
                    System.out.println("2. Edit day of birth");
                    System.out.println("3. Edit gender");
                    System.out.println("4. Edit number identity card");
                    System.out.println("5. Edit number phone");
                    System.out.println("6. Edit email");
                    System.out.println("7. Edit type guest");
                    System.out.println("8. Edit address");
                    System.out.println("9. Return");
                    try {
                        System.out.print("Enter choice edit : ");
                        choice = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                    switch (choice) {
                        case 1:
                            nameEdit = getNameCustomer();
                            customerList.get(i).setName(nameEdit);
                            break;
                        case 2:
                            dayOfBirthEdit = getDateCustomer();
                            customerList.get(i).setDayOfBirth(dayOfBirthEdit);
                            break;
                        case 3:
                            genderEdit = getGenderCustomer();
                            customerList.get(i).setGender(genderEdit);
                            break;
                        case 4:
                            numberIdentityCardEdit = getNumberIdentityCardCustomer();
                            customerList.get(i).setNumberIdentityCard(numberIdentityCardEdit);
                            break;
                        case 5:
                            numberPhoneEdit = getNumberPhoneCustomer();
                            customerList.get(i).setNumberPhone(numberPhoneEdit);
                            break;
                        case 6:
                            emailEdit = getEmailCustomer();
                            customerList.get(i).setEmail(emailEdit);
                            break;
                        case 7:
                            typeGuestEdit = getTypeGuest();
                            customerList.get(i).setTypeGuest(typeGuestEdit);
                            break;
                        case 8:
                            addressEdit = getAddress();
                            customerList.get(i).setAddress(addressEdit);
                            break;
                        case 9:
                            break LOOP;
                        default:
                            System.out.println("Enter repeat");
                            break;
                    }
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Don't have id to edit");
        }
        WriteFileUtils.writeFileCustomer(CUSTOMER_CSV, customerList);
    }

    public static String getInfo(Customer customer) {
        return customer.getId() + ";" + customer.getName() + ";" + customer.getDayOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ";" + customer.getGender() + ";"
                + customer.getNumberIdentityCard() + ";" + customer.getNumberPhone() + ";" + customer.getEmail() + ";" + customer.getTypeGuest() + ";" + customer.getAddress();
    }
}
