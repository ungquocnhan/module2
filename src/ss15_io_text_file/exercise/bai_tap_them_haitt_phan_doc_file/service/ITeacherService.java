package ss15_io_text_file.exercise.bai_tap_them_haitt_phan_doc_file.service;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ITeacherService {
    void addTeacher() throws IOException;

    void removeTeacher();

    void displayTeacher() throws IOException;

    void searchTeacherName();

    void searchTeacherId();

    void sortTeacher() throws IOException;
}
