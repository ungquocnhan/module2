package ss16_binary_file.exercise.copy_file_binary_file;

import ss15_io_text_file.exercise.copy_file_text.FileFoundException;

import java.io.*;

public class CopyFile {

    public static final String SOURCE_CSV = "F:\\CODEGYM\\module_2\\src\\ss16_binary_file\\exercise\\copy_file_binary_file\\source.csv";
    public static final String TARGET_CSV = "F:\\CODEGYM\\module_2\\src\\ss16_binary_file\\exercise\\copy_file_binary_file\\target.csv";


    private static void writeFile() {
        FileOutputStream fos;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(SOURCE_CSV);
            oos = new ObjectOutputStream(fos);

            String string = "Viết một chương trình cho phép người dùng sao chép các tập tin. Người sử dụng cần phải cung cấp một tập tin nguồn (source file) và một tập tin đích (target file).\n" +
                    "\n" +
                    "Chương trình sao chép tệp nguồn vào tệp tin đích và hiển thị số byte trong tệp. Chương trình nên cảnh báo người dùng nếu tệp nguồn không tồn tại hoặc nếu tập tin đích đã tồn tại.\n" +
                    "\n" +
                    "Để sao chép nội dung từ tệp tin nguồn đến tệp tin đích, bạn nên sử dụng luồng đầu vào để đọc byte từ tệp nguồn và luồng đầu ra để gửi byte đến tệp tin đích, bất kể nội dung của tệp.";
            oos.writeObject(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readAndWriteFile(File source, File target) {
        InputStream is = null;
        OutputStream os = null;
        try {
            if (!source.exists()) {
                throw new FileNotFoundException();
            }

            if (target.exists()) {
                throw new FileFoundException();
            }
            is = new FileInputStream(source);
            os = new FileOutputStream(target);
            byte[] bytes = new byte[1024];
            int length;
            int count = 0;
            while ((length = is.read(bytes)) > 0) {
                os.write(bytes, 0, length);
                count += length;
            }
            System.out.println("Số byte trong tệp : " + count);
        } catch (FileNotFoundException e) {
            System.out.println("File source không tồn tại");
        } catch (FileFoundException e) {
            System.out.println("File target đã tồn tại");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert is != null;
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                assert os != null;
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CopyFile.writeFile();
        File sourceFile = new File(SOURCE_CSV);
        File targetFile = new File(TARGET_CSV);
        readAndWriteFile(sourceFile, targetFile);
        System.out.println("Copy completed");
    }
}
