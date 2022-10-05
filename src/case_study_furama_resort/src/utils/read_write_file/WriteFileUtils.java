package case_study_furama_resort.src.utils.read_write_file;

import case_study_furama_resort.src.model.person.Customer;
import case_study_furama_resort.src.model.person.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static case_study_furama_resort.src.service.impl.EmployeeServiceImpl.getInfo;
import static case_study_furama_resort.src.service.impl.CustomerServiceImpl.getInfo;

public class WriteFileUtils {

    public static void writeFileEmployee(String filePath,List<Employee> employeeList) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employeeList) {
                bufferedWriter.write(getInfo(employee));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
        try {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFileCustomer(String filePath,List<Customer> customerList) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customerList) {
                bufferedWriter.write(getInfo(customer));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
        try {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
