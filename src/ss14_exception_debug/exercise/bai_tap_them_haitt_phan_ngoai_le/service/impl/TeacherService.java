package ss14_exception_debug.exercise.bai_tap_them_haitt_phan_ngoai_le.service.impl;

import ss14_exception_debug.exercise.bai_tap_them_haitt_phan_ngoai_le.model.Teacher;
import ss14_exception_debug.exercise.bai_tap_them_haitt_phan_ngoai_le.service.ITeacherService;
import ss14_exception_debug.exercise.bai_tap_them_haitt_phan_ngoai_le.utils.*;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");



    @Override
    public void addTeacher() {
        Teacher teacher = this.infoTeacher();

        teacherList.add(teacher);
        System.out.println("Thêm mới thành công");

    }

    @Override
    public void removeTeacher() {
        System.out.print("Mời bạn nhập mã giảng viên cần xóa: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getCode().equals(code)) {
                System.out.println("Bạn có chắc muốn xóa giảng viên này không? Nhập Y: yes, N: no ");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    teacherList.remove(i);
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
    public void displayTeacher() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void searchTeacherName() {
        System.out.print("Mời bạn nhập tên giảng viên cần tìm: ");
        String name = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getName().contains(name)) {
                System.out.println(teacherList.get(i).toString());
                flagDelete = true;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy giảng viên cần tìm.");
        }
    }

    @Override
    public void searchTeacherId() {
        System.out.print("Mời bạn nhập mã giảng viên cần tìm: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getCode().equals(code)) {
                System.out.println(teacherList.get(i).toString());
                flagDelete = true;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy giảng viên cần tìm.");
        }
    }

    @Override
    public void sortTeacher() {
        for (int i = 1; i < teacherList.size(); i++) {
            Teacher key = teacherList.get(i);
            int j;
            for (j = i - 1; j >= 0 && teacherList.get(j).getName().compareTo(key.getName()) > 0; j--) {
                    teacherList.set(j + 1, teacherList.get(j));
            }
            teacherList.set(j + 1, key);
        }
        displayTeacher();
    }

    private Teacher infoTeacher() {
        String code = addCode();

        String name = addName();

        LocalDate dayOfBirth = addDayBirth();

        String gender = addGender();

        String technique = addTechnique();

        Teacher teacher = new Teacher(code, name, dayOfBirth, gender, technique);
        return teacher;
    }

    private String addTechnique() {
        String technique;
        while (true) {
            try {
                System.out.print("Mời bạn nhập chuyên môn giảng viên: ");
                technique = scanner.nextLine();
                if (!technique.matches("^[a-zA-Z0-9'-'\\sáàảãạăâắằấầặẵẫậéèẻ ẽẹếềểễệóòỏõọôốồổỗộ ơớờởỡợíìỉĩịđùúủũụưứ� �ửữựÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠ ƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼ� ��ỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞ ỠỢỤỨỪỬỮỰỲỴÝỶỸửữựỵ ỷỹ]*$")) {
                    throw new CheckTechniqueException("Bạn nhập không đúng định dạng");
                }
                break;
            } catch (CheckTechniqueException e) {
                System.out.println(e.getMessage());
            }
        }
        return technique;
    }

    private String addGender() {
        String gender;
        while (true) {
            try {
                System.out.print("Mời bạn nhập giới tính giảng viên: ");
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
                System.out.print("Mời bạn nhập ngày sinh giảng viên: ");
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
                System.out.print("Mời bạn nhập tên giảng viên: ");
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
                System.out.print("Mời bạn nhập mã giảng viên : ");
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