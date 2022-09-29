package ss15_io_text_file.exercise.read_file_csv.service;

import ss15_io_text_file.exercise.read_file_csv.model.Country;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountryService {

    public static List<Country> readCountry() throws IOException {
        File file = new File("F:/CODEGYM/module_2/src/ss15_io_text_file/exercise/read_file_csv/data/country.csv");

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<Country> countryList = new ArrayList<>();
        String[] info;
        Country country;
        while ((line = bufferedReader.readLine()) != null){
            info = line.split(",");
            country = new Country(Integer.parseInt(info[0]), info[1], info[2]);
            countryList.add(country);
        }
        bufferedReader.close();
        return countryList;
    }


}
