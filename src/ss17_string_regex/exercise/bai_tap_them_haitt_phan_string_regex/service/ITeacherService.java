package ss17_string_regex.exercise.bai_tap_them_haitt_phan_string_regex.service;


import java.io.IOException;

public interface ITeacherService {
    void addTeacher() throws IOException;

    void removeTeacher() throws IOException;

    void displayTeacher() throws IOException;

    void searchTeacherName() throws IOException;

    void searchTeacherId() throws IOException;

    void sortTeacher() throws IOException;
}
