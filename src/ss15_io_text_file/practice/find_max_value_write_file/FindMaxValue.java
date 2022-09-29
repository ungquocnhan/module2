package ss15_io_text_file.practice.find_max_value_write_file;

import java.util.List;

public class FindMaxValue {
    public static final String FILE_NAME_1 = "F:/CODEGYM/module_2/src/ss15_io_text_file/practice/find_max_value_write_file/numbers.txt";
    public static final String FILE_NAME_2 = "F:/CODEGYM/module_2/src/ss15_io_text_file/practice/find_max_value_write_file/result.txt";
    public static int findMax(List<Integer> integerList){
        int max = integerList.get(0);
        for (Integer integer : integerList) {
            if (max < integer) {
                max = integer;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> integerList = readAndWriteFile.readFile(FILE_NAME_1);
        int maxValue = findMax(integerList);
        readAndWriteFile.writeFile(FILE_NAME_2, maxValue);
    }
}
