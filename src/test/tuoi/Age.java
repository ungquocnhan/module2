package test.tuoi;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Day");
        LocalDate day = LocalDate.parse(scanner.nextLine(),formatter);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(day,now);
        if(diff.getYears() > 18){
            System.out.println("Đủ tuổi");
        }else {
            System.out.println("Chưa đủ tuổi");
        }
    }


}
