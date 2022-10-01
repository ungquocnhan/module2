package ss17_string_regex.exercise.bai_tap_them_haitt_phan_string_regex.service.impl;


import ss17_string_regex.exercise.bai_tap_them_haitt_phan_string_regex.model.Teacher;
import ss17_string_regex.exercise.bai_tap_them_haitt_phan_string_regex.service.ITeacherService;
import ss17_string_regex.exercise.bai_tap_them_haitt_phan_string_regex.utils.exception.CheckCodeException;
import ss17_string_regex.exercise.bai_tap_them_haitt_phan_string_regex.utils.exception.CheckGenderException;
import ss17_string_regex.exercise.bai_tap_them_haitt_phan_string_regex.utils.exception.CheckNameException;
import ss17_string_regex.exercise.bai_tap_them_haitt_phan_string_regex.utils.exception.CheckTechniqueException;

import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    public static final String TEACHER = "F:/CODEGYM/module_2/src/ss17_string_regex/exercise/bai_tap_them_haitt_phan_string_regex/data/teacher.csv";
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    @Override
    public void addTeacher() throws IOException {
        teacherList = getAllTeacherFromFile();
        Teacher teacher = this.infoTeacher();

        teacherList.add(teacher);
        System.out.println("Thêm mới thành công");
        writeFile(teacherList);
    }

    private void writeFile(List<Teacher> teacherList) throws IOException {
        File file = new File(TEACHER);

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Teacher teacher : teacherList) {
            bufferedWriter.write(getInfo(teacher));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public String getInfo(Teacher teacher) {
        return teacher.getCode() + "," + teacher.getName() + "," + teacher.getDayOfBirth() + "," + teacher.getGender() + "," + teacher.getTechnique();
    }

    private List<Teacher> getAllTeacherFromFile() throws IOException {
        File file = new File(TEACHER);

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<Teacher> teacherList = new ArrayList<>();
        String[] info;
        Teacher teacher;
        while ((line = bufferedReader.readLine()) != null) {
            info = line.split(",");
            teacher = new Teacher();
            teacher.setCode(info[0]);
            teacher.setName(info[1]);
            teacher.setDayOfBirth(LocalDate.parse(info[2]), formatter);
            teacher.setGender(info[3]);
            teacher.setTechnique(info[4]);
            teacherList.add(teacher);
        }
        bufferedReader.close();

        return teacherList;
    }

    @Override
    public void removeTeacher() throws IOException {
        teacherList = getAllTeacherFromFile();
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
        writeFile(teacherList);
    }

    @Override
    public void displayTeacher() throws IOException {
        teacherList = getAllTeacherFromFile();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void searchTeacherName() throws IOException {
        teacherList = getAllTeacherFromFile();
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
    public void searchTeacherId() throws IOException {
        teacherList = getAllTeacherFromFile();
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
    public void sortTeacher() throws IOException {
        teacherList = getAllTeacherFromFile();
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
                if (!technique.matches("^[IT][c-u]{4,9}\\s[M][d-u]{5}[1-6]$")) {
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
                String[] str = name.trim().split(" ");
                String regex;
                for (int i = 0; i < str.length; i++) {
                    regex = "^[A-ZÂÊÔƯĐ][a-záàảãạâấầẩẫậăắằẳẵặéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđ]{1,5}$";
                    if (!str[i].matches(regex)) {
                        throw new CheckNameException("Bạn nhập không đúng định dạng");
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
                System.out.print("Mời bạn nhập mã giảng viên : ");
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