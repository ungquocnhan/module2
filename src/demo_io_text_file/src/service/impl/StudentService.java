package demo_io_text_file.src.service.impl;


import demo_io_text_file.src.model.Student;
import demo_io_text_file.src.service.IStudentService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    public static final String STUDENT_CSV = "F:\\CODEGYM\\module_2\\src\\demo_io_text_file\\src\\data\\student.csv";
    private static Scanner scanner = new Scanner(System.in);
  private static List<Student> studentList = new ArrayList<>();
    @Override
    public void addStudent() {
        studentList = readFileStudent();
        Student student = this.infoStudent();
        studentList.add(student);
        writeFileStudent(studentList);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void displayAllStudent() {
        studentList = readFileStudent();
        for(Student student: studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
        studentList = readFileStudent();
        System.out.print("Mời bạn nhập mã học sinh cần xóa: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for(int i = 0 ; i< studentList.size(); i++) {
            if(studentList.get(i).getCode().equals(code)) {
                System.out.println("Bạn có chắc muốn xóa học sinh này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if(choice.equals("Y")) {
                    studentList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if(!flagDelete) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        } else {
            writeFileStudent(studentList);
        }
    }

    public Student infoStudent() {
        System.out.print("Mời bạn nhập mã học sinh: ");
        String code = scanner.nextLine();
        System.out.print("Mời bạn nhập tên học sinh: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập giới tính học sinh: ");
        String tempGender = scanner.nextLine();
        Boolean gender;
        if(tempGender.equals("Nam")) {
            gender = true;
        } else if(tempGender.equals("Nữ")) {
            gender= false;
        } else {
            gender = null;
        }
        System.out.print("Mời bạn nhập tên lớp: ");
        String nameClass = scanner.nextLine();
        System.out.print("Mời bạn nhập điểm của học sinh: ");
        double score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(code,name,gender,nameClass,score);
        return student;
    }
    private List<Student> readFileStudent() {
        FileReader file = null;
        List<Student> studentList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            file = new FileReader(STUDENT_CSV);
            bufferedReader = new BufferedReader(file);
            String line;
            String properties[];
            Student student;
            while ((line = bufferedReader.readLine())!= null) {
                properties = line.split(",");
                student = new Student(properties[0],properties[1],Boolean.parseBoolean(properties[2]), properties[3], Double.parseDouble(properties[4]));
                studentList.add(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }
    private void writeFileStudent(List<Student> students) {
        BufferedWriter bufferedWriter =null;
        try {
            FileWriter fileWriter = new FileWriter(STUDENT_CSV);
            bufferedWriter = new BufferedWriter(fileWriter);
            for(Student student: students) {
                bufferedWriter.write(getInfo(student));
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
    private String getInfo(Student student) {
        return student.getCode()+","+student.getName()+","+student.getGender()+","+student.getNameClass()+","+student.getScore();
    }
}
