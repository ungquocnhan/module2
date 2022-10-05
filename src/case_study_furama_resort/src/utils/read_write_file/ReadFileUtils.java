package case_study_furama_resort.src.utils.read_write_file;

import case_study_furama_resort.src.model.person.Customer;
import case_study_furama_resort.src.model.person.Employee;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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
                info = s.split(";");
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
        try{
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
}
