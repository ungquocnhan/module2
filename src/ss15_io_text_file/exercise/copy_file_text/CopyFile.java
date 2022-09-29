package ss15_io_text_file.exercise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyFile {
    public static final String SOURCE_FILE = "F:/CODEGYM/module_2/src/ss15_io_text_file/exercise/copy_file_text/source_file";
    public static final String TARGET_FILE = "F:/CODEGYM/module_2/src/ss15_io_text_file/exercise/copy_file_text/target_file";

    public static void copyFile(String source, String target) {
        try {
            File file = new File(source);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            File file1 = new File(target);
            if (file1.exists()) {
                throw new IOException();
            }

            FileReader fileReader = new FileReader(source);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";

            FileWriter fileWriter = new FileWriter(file1);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String[] strings;
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(" ");
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                count += strings.length;
            }
            bufferedWriter.write("Số ký tự trong tệp : " + count);
            bufferedReader.close();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File nguồn không tồn tại");
        } catch (IOException e) {
            System.out.println("File đích đã tồn tại");
        }
    }

    public static void main(String[] args) {
        copyFile(SOURCE_FILE, TARGET_FILE);
    }
}

