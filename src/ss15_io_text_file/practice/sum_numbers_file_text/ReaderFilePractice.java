package ss15_io_text_file.practice.sum_numbers_file_text;

import java.io.*;
import java.util.Scanner;

public class ReaderFilePractice {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);


            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();

            System.out.println("Tổng = " + sum );

        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReaderFilePractice readerFilePractice = new ReaderFilePractice();
        readerFilePractice.readFileText(path);
    }
}
