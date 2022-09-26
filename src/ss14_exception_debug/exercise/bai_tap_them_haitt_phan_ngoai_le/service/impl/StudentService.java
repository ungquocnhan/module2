package ss14_exception_debug.exercise.bai_tap_them_haitt_phan_ngoai_le.service.impl;

import ss14_exception_debug.exercise.bai_tap_them_haitt_phan_ngoai_le.model.Student;
import ss14_exception_debug.exercise.bai_tap_them_haitt_phan_ngoai_le.service.IStudentService;
import ss14_exception_debug.exercise.bai_tap_them_haitt_phan_ngoai_le.utils.*;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public void addStudent() {
        Student student = this.infoStudent();

        studentList.add(student);
        System.out.println("Thêm mới thành công");

    }

    @Override
    public void removeStudent() {
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
    }

    @Override
    public void displayStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void searchStudentName() {
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
    public void searchStudentId() {
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
    public void sortStudent() {
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
        while (true){
            try {
                System.out.print("Mời bạn nhập điểm của học sinh: ");
                point = Double.parseDouble(scanner.nextLine());
                if(point < 0 || point > 10){
                    throw new CheckPointException("Nhập lại điểm");
                }
                break;
            }catch (CheckPointException | NumberFormatException e){
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
                if (!nameClass.matches("[a-zA-z0-9]{7}")) {
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
                System.out.print("Mời bạn nhập giới tính sinh viên: ");
                gender = scanner.nextLine();
                if (!gender.matches("^[a-zA-Z\\sữô]*$")) {
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
                if (!name.matches("^[A-Z][a-zA-Z'-'\\sáàảãạăâắằấầặẵẫậéèẻ ẽẹếềểễệóòỏõọôốồổỗộ ơớờởỡợíìỉĩịđùúủũụưứ� �ửữựÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠ ƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼ� ��ỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞ ỠỢỤỨỪỬỮỰỲỴÝỶỸửữựỵ ỷỹ]{3,25}")) {
                    throw new CheckNameException("Bạn nhập không đúng định dạng");
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
                if (!code.matches("[a-zA-Z0-9]{4,6}")) {
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
