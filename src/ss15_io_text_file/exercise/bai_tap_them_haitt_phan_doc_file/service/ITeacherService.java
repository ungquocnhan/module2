package ss15_io_text_file.exercise.bai_tap_them_haitt_phan_doc_file.service;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ITeacherService {
    void addTeacher() throws IOException;

    void removeTeacher() throws IOException;

    void displayTeacher() throws IOException;

    void searchTeacherName() throws IOException;

    void searchTeacherId() throws IOException;

    void sortTeacher() throws IOException;
}
