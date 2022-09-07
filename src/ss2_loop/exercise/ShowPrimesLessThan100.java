package ss2_loop.exercise;

public class ShowPrimesLessThan100 {
    public static void main(String[] args) {
        int number = 2;

        while (number < 100) {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number);
            }
            number++;
        }
    }
}
