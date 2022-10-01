package ss17_string_regex.exercise.bai_tap_them_haitt_phan_string_regex.service;

import java.io.IOException;

public interface IStudentService {
    void addStudent() throws IOException;

    void removeStudent() throws IOException;

    void displayStudent() throws IOException;

    void searchStudentName() throws IOException;

    void searchStudentId() throws IOException;

    void sortStudent() throws IOException;
}
