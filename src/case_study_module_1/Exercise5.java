package case_study_module_1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter salary (million) : ");
        double salary = Double.parseDouble(scanner.nextLine());
        double salaryReceive;

        if (salary == 15) {
            salaryReceive = salary - salary * 20 / 100;
            System.out.printf("Salary received : %.3f million", salaryReceive);
        } else if (salary >= 7) {
            salaryReceive = salary - salary * 10 / 100;
            System.out.printf("Salary received : %.3f million", salaryReceive);
        } else {
            salaryReceive = salary - salary * 5 / 100;
            System.out.printf("Salary received : %.3f million", salaryReceive);
        }
    }
}
