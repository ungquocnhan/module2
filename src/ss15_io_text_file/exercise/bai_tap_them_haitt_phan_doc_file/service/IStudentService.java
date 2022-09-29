package ss15_io_text_file.exercise.bai_tap_them_haitt_phan_doc_file.service;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IStudentService {
    void addStudent() throws IOException;

    void removeStudent();

    void displayStudent() throws IOException;

    void searchStudentName();

    void searchStudentId();

    void sortStudent() throws IOException;
}
