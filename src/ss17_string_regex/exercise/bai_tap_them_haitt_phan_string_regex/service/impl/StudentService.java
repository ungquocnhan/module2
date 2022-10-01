package ss17_string_regex.exercise.bai_tap_them_haitt_phan_string_regex.service.impl;


import ss17_string_regex.exercise.bai_tap_them_haitt_phan_string_regex.model.Student;
import ss17_string_regex.exercise.bai_tap_them_haitt_phan_string_regex.service.IStudentService;
import ss17_string_regex.exercise.bai_tap_them_haitt_phan_string_regex.utils.exception.*;

import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    public static final String STUDENT = "F:/CODEGYM/module_2/src/ss17_string_regex/exercise/bai_tap_them_haitt_phan_string_regex/data/student.csv";
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public void addStudent() throws IOException {
        studentList = getAllStudentFromFile();
        Student student = this.infoStudent();

        studentList.add(student);
        System.out.println("Thêm mới thành công");
        writeFile(studentList);
    }

    private void writeFile(List<Student> studentList) throws IOException {
        File file = new File(STUDENT);

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Student student : studentList) {
            bufferedWriter.write(getInfo(student));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    private String getInfo(Student student) {
        return student.getCode() + "," + student.getName() + "," + student.getDayOfBirth() + "," + student.getGender() + "," + student.getNameClass() + "," + student.getPoint();
    }

    private List<Student> getAllStudentFromFile() throws IOException {
        File file = new File(STUDENT);

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<Student> studentList = new ArrayList<>();
        String[] info;
        Student student;
        while ((line = bufferedReader.readLine()) != null) {
            info = line.split(",");
            student = new Student();
            student.setCode(info[0]);
            student.setName(info[1]);
            student.setDayOfBirth(LocalDate.parse(info[2]), formatter);
            student.setGender(info[3]);
            student.setNameClass(info[4]);
            student.setPoint(Double.parseDouble(info[5]));
            studentList.add(student);
        }
        bufferedReader.close();

        return studentList;
    }

    @Override
    public void removeStudent() throws IOException {
        studentList = getAllStudentFromFile();
        System.out.print("Mời bạn nhập mã học sinh cần xóa: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getCode().equals(code)) {
                System.out.println("Bạn có chắc muốn xóa học sinh này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    studentList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
        writeFile(studentList);
    }

    @Override
    public void displayStudent() throws IOException {
        studentList = getAllStudentFromFile();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void searchStudentName() throws IOException {
        studentList = getAllStudentFromFile();
        System.out.print("Mời bạn nhập tên học sinh cần tìm: ");
        String name = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().contains(name)) {
                System.out.println(studentList.get(i).toString());
                flagDelete = true;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy học sinh cần tìm.");
        }
    }

    @Override
    public void searchStudentId() throws IOException {
        studentList = getAllStudentFromFile();
        System.out.print("Mời bạn nhập mã học sinh cần tìm: ");
        String code = scanner.nextLine();
        boolean flagSearch = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getCode().equals(code)) {
                System.out.println(studentList.get(i).toString());
                flagSearch = true;
            }
        }
        if (!flagSearch) {
            System.out.println("Không tìm thấy học sinh cần tìm.");
        }
    }

    @Override
    public void sortStudent() throws IOException {
        studentList = getAllStudentFromFile();
        for (int i = 1; i < studentList.size(); i++) {
            Student key = studentList.get(i);
            int j;
            for (j = i - 1; j >= 0 && studentList.get(j).getName().compareTo(key.getName()) > 0; j--) {
                studentList.set(j + 1, studentList.get(j));
            }
            studentList.set(j + 1, key);
        }
        displayStudent();
    }


    private Student infoStudent() {
        String code = addCode();

        String name = addName();

        LocalDate dayOfBirth = addDayBirth();

        String gender = addGender();

        String nameClass = addNameClass();

        double point = addPoint();

        Student student = new Student(code, name, dayOfBirth, gender, nameClass, point);
        return student;
    }

    private double addPoint() {
        double point;
        while (true) {
            try {
                System.out.print("Mời bạn nhập điểm của học sinh: ");
                point = Double.parseDouble(scanner.nextLine());
                if (point < 0 || point > 10) {
                    throw new CheckPointException("Nhập lại điểm");
                }
                break;
            } catch (CheckPointException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return point;
    }

    private String addNameClass() {
        String nameClass;
        while (true) {
            try {
                System.out.print("Mời bạn nhập tên lớp: ");
                nameClass = scanner.nextLine();
                if (!nameClass.matches("^C[0-9]{4}G[12]$")) {
                    throw new CheckNameClassException("Bạn nhập không đúng định dạng");
                }
                break;
            } catch (CheckNameClassException e) {
                System.out.println(e.getMessage());
            }
        }
        return nameClass;
    }

    private String addGender() {
        String gender;
        while (true) {
            try {
                System.out.print("Mời bạn nhập giới tính sinh viên (Nam, Nữ, Không) : ");
                gender = scanner.nextLine();
                if (!gender.matches("^[NKamhngữô]+$")) {
                    throw new CheckGenderException("Bạn nhập không đúng định dạng");
                }
                break;
            } catch (CheckGenderException e) {
                System.out.println(e.getMessage());
            }
        }
        return gender;
    }

    private LocalDate addDayBirth() {
        LocalDate dayOfBirth;
        while (true) {
            try {
                System.out.print("Mời bạn nhập ngày sinh sinh viên: ");
                dayOfBirth = LocalDate.parse(scanner.nextLine(), formatter);
                break;
            } catch (DateTimeException e) {
                System.out.println("Ngày nhập sai định dạng, nhập lại");
            }
        }
        return dayOfBirth;
    }

    private String addName() {
        String name;
        while (true) {
            try {
                System.out.print("Mời bạn nhập tên sinh viên: ");
                name = scanner.nextLine();
                String[] str = name.trim().split(" ");
                String regex;
                for (int i = 0; i < str.length; i++) {
                    regex = "^[A-ZÂÊÔƯĐ][a-záàảãạâấầẩẫậăắằẳẵặéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđ]{1,5}$";
                    if (!str[i].matches(regex)) {
                        throw new CheckNameException("Nhập sai định dạng");
                    }
                }
                break;
            } catch (CheckNameException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    private String addCode() {
        String code;
        while (true) {
            try {
                System.out.print("Mời bạn nhập mã sinh viên: ");
                code = scanner.nextLine();
                if (!code.matches("^CG[0-9]{2}$")) {
                    throw new CheckCodeException("Bạn nhập không đúng định dạng");
                }
                break;
            } catch (CheckCodeException e) {
                System.out.println(e.getMessage());
            }
        }
        return code;
    }


}
