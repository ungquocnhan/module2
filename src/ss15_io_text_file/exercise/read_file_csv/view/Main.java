package ss15_io_text_file.exercise.read_file_csv.view;

import ss15_io_text_file.exercise.read_file_csv.model.Country;
import ss15_io_text_file.exercise.read_file_csv.service.CountryService;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Country> countryList = CountryService.readCountry();

        for (Country country : countryList) {
            System.out.println(country.getName());
        }
    }
}
