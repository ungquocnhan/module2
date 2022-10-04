package case_study_furama_resort.src.utils.read_write_file;

import case_study_furama_resort.src.model.person.Employee;

import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private static BufferedReader readFile(String filePath) {
        BufferedReader bufferedReader = null;
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return bufferedReader;
    }

    public static List<Employee> getAllEmployeeFromFile(String filePath) {
        BufferedReader bufferedReader = readFile(filePath);
        List<Employee> employeeList = new ArrayList<>();
        try {
            String line;
            String[] info;
            Employee employee;
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                employee = new Employee();
                employee.setId(info[0]);
                employee.setName(info[1]);
                employee.setDayOfBirth(LocalDate.parse(info[2]),formatter);
                employee.setGender(info[3]);
                employee.setNumberIdentityCard(info[4]);
                employee.setNumberPhone(info[5]);
                employee.setEmail(info[6]);
                employee.setLevel(info[7]);
                employee.setPosition(info[8]);
                employee.setSalary(Double.parseDouble(info[9]));
                employeeList.add(employee);
            }
        } catch (NullPointerException e) {
            employeeList = new ArrayList<>();
        }catch (DateTimeException | IOException e){
            System.out.println(e.getMessage());
        }
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    private static BufferedWriter writeFile(String filePath) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bufferedWriter;
    }

    public static void writeFileEmployee(List<Employee> employeeList, String filePath) {
        BufferedWriter bufferedWriter = writeFile(filePath);
        try {
            for (Employee employee : employeeList) {
                bufferedWriter.write(getInfo(employee));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getInfo(Employee employee) {
        return employee.getId() + "," + employee.getName() + "," + employee.getDayOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "," + employee.getGender() + ","
                + employee.getNumberIdentityCard() + "," + employee.getNumberPhone() + "," + employee.getEmail() + "," + employee.getLevel() + "," + employee.getPosition() + "," + employee.getSalary();
    }
}
