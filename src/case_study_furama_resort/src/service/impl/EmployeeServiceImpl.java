package case_study_furama_resort.src.service.impl;

import case_study_furama_resort.src.model.person.Employee;
import case_study_furama_resort.src.service.EmployeeService;
import case_study_furama_resort.src.utils.exception.CheckFormatException;
import case_study_furama_resort.src.utils.read_write_file.ReadFileUtils;
import case_study_furama_resort.src.utils.read_write_file.WriteFileUtils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static final String EMPLOYEE_CSV = "src\\case_study_furama_resort\\src\\data\\employee.csv";
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public void displayListEmployees() {
        employeeList = ReadFileUtils.getAllEmployeeFromFile(EMPLOYEE_CSV);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addNewEmployee() {
        employeeList = ReadFileUtils.getAllEmployeeFromFile(EMPLOYEE_CSV);
        Employee employee = this.infoEmployee();
        employeeList.add(employee);
        WriteFileUtils.writeFileEmployee(EMPLOYEE_CSV, employeeList);
        System.out.println("Enter success");
    }

    private Employee infoEmployee() {

        String id = getIdEmployee();

        String name = getNameEmployee();

        LocalDate dayOfBirth = getDateEmployee();

        String gender = getGenderEmployee();

        String numberIdentityCard = getNumberIdentityCardEmployee();

        String numberPhone = getNumberPhoneEmployee();

        String email = getEmailEmployee();

        String level = getLevelEmployee();

        String position = getPositionEmployee();

        double salary = getSalaryEmployee();

        Employee employee = new Employee(id, name, dayOfBirth, gender, numberIdentityCard, numberPhone, email, level, position, salary);
        return employee;
    }

    private String getIdEmployee() {
        String id;
        while (true) {
            try {
                System.out.println("Enter id follow format FUE-xxx x : 3 number");
                System.out.print("Id employee : ");
                id = scanner.nextLine();
                CheckFormatException.checkId(id);
                boolean flagId = false;
                for (Employee employee : employeeList) {
                    if (employee.getId().equals(id)) {
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

    private double getSalaryEmployee() {
        double salary;
        while (true) {
            try {
                System.out.print("Enter salary : ");
                salary = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return salary;
    }

    private String getEmailEmployee() {
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

    private String getNumberPhoneEmployee() {
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

    private String getNumberIdentityCardEmployee() {
        String numberIdentityCard;
        while (true) {
            try {
                System.out.println("Enter number identity card follow format xxxxxxxxxxxx  x: 9-12 number");
                System.out.print("Enter number identity card : ");
                numberIdentityCard = scanner.nextLine();
                CheckFormatException.checkNumberIdentityCard(numberIdentityCard);
                boolean flagCheck = false;
                for (Employee employee : employeeList) {
                    if (employee.getNumberIdentityCard().equals(numberIdentityCard)) {
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

    private LocalDate getDateEmployee() {
        LocalDate dayOfBirth;
        LocalDate now;
        while (true) {
            try {
                System.out.print("Enter day of birth employee : ");
                dayOfBirth = LocalDate.parse(scanner.nextLine(), formatter);
                now = LocalDate.now();
                Period checkAge = Period.between(dayOfBirth, now);
                if (checkAge.getYears() < 18 || checkAge.getYears() > 70) {
                    System.out.println("Not enough age or too old to work. re-enter");
                } else {
                    break;
                }

            } catch (DateTimeException e) {
                System.out.println("Enter incorrect format of day, re-enter");
            }
        }
        return dayOfBirth;
    }

    private String getNameEmployee() {
        String name;
        while (true) {
            try {
                System.out.print("Enter name employee : ");
                name = scanner.nextLine();
                CheckFormatException.checkName(name);
                break;
            } catch (CheckFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    private String getGenderEmployee() {
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

    private String getLevelEmployee() {
        String level;
        int choiceLevel = 0;
        LOOP:
        while (true) {
            System.out.println("1. Intermediate");
            System.out.println("2. College");
            System.out.println("3. University");
            System.out.println("4. After university");
            System.out.print("Enter choice level : ");
            try {
                choiceLevel = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }

            switch (choiceLevel) {
                case 1:
                    level = "Intermediate";
                    break LOOP;
                case 2:
                    level = "College";
                    break LOOP;
                case 3:
                    level = "University";
                    break LOOP;
                case 4:
                    level = "After university";
                    break LOOP;
                default:
                    System.out.println("Enter repeat 1 - 4");
                    break;
            }
        }
        return level;
    }

    private String getPositionEmployee() {
        String position;
        int choicePosition = 0;
        LOOP:
        while (true) {
            System.out.println("1. Receptionist");
            System.out.println("2. Service");
            System.out.println("3. Expert");
            System.out.println("4. Monitoring");
            System.out.println("5. Manage");
            System.out.println("6. Director");
            System.out.print("Enter position : ");
            try {
                choicePosition = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            switch (choicePosition) {
                case 1:
                    position = "Receptionist";
                    break LOOP;
                case 2:
                    position = "Service";
                    break LOOP;
                case 3:
                    position = "Expert";
                    break LOOP;
                case 4:
                    position = "Monitoring";
                    break LOOP;
                case 5:
                    position = "Manage";
                    break LOOP;
                case 6:
                    position = "Director";
                    break LOOP;
                default:
                    System.out.println("Enter repeat 1 - 6");
                    break;
            }
        }
        return position;
    }

    @Override
    public void editEmployee() {
        employeeList = ReadFileUtils.getAllEmployeeFromFile(EMPLOYEE_CSV);
        System.out.print("Enter id employee edit : ");
        String id = scanner.nextLine();
        boolean flagDelete = false;
        String nameEdit;
        LocalDate dayOfBirthEdit;
        String genderEdit;
        String numberIdentityCardEdit;
        String numberPhoneEdit;
        String emailEdit;
        String levelEdit;
        String positionEdit;
        double salaryEdit;
        int choice = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                LOOP:
                while (true) {
                    System.out.println("Menu Edit");
                    System.out.println("1. Edit name");
                    System.out.println("2. Edit day of birth");
                    System.out.println("3. Edit gender");
                    System.out.println("4. Edit number identity card");
                    System.out.println("5. Edit number phone");
                    System.out.println("6. Edit email");
                    System.out.println("7. Edit level");
                    System.out.println("8. Edit position");
                    System.out.println("9. Edit salary");
                    System.out.println("10. Return");
                    try {
                        System.out.print("Enter choice edit : ");
                        choice = Integer.parseInt(scanner.nextLine());

                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                    switch (choice) {
                        case 1:
                            nameEdit = getNameEmployee();
                            employeeList.get(i).setName(nameEdit);
                            break;
                        case 2:
                            dayOfBirthEdit = getDateEmployee();
                            employeeList.get(i).setDayOfBirth(dayOfBirthEdit);
                            break;
                        case 3:
                            genderEdit = getGenderEmployee();
                            employeeList.get(i).setGender(genderEdit);
                            break;
                        case 4:
                            numberIdentityCardEdit = getNumberIdentityCardEmployee();
                            employeeList.get(i).setNumberIdentityCard(numberIdentityCardEdit);
                            break;
                        case 5:
                            numberPhoneEdit = getNumberPhoneEmployee();
                            employeeList.get(i).setNumberPhone(numberPhoneEdit);
                            break;
                        case 6:
                            emailEdit = getEmailEmployee();
                            employeeList.get(i).setEmail(emailEdit);
                            break;
                        case 7:
                            levelEdit = getLevelEmployee();
                            employeeList.get(i).setLevel(levelEdit);
                            break;
                        case 8:
                            positionEdit = getPositionEmployee();
                            employeeList.get(i).setPosition(positionEdit);
                            break;
                        case 9:
                            salaryEdit = getSalaryEmployee();
                            employeeList.get(i).setSalary(salaryEdit);
                            break;
                        case 10:
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
        WriteFileUtils.writeFileEmployee(EMPLOYEE_CSV, employeeList);
    }

    public static String getInfo(Employee employee) {
        return employee.getId() + ";" + employee.getName() + ";" + employee.getDayOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ";" + employee.getGender() + ";"
                + employee.getNumberIdentityCard() + ";" + employee.getNumberPhone() + ";" + employee.getEmail() + ";" + employee.getLevel() + ";" + employee.getPosition() + ";" + employee.getSalary();
    }
}
