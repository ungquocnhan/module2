package ss2_loop.exercise;


public class ShowFirst20Primes {
    public static void main(String[] args) {

        int numbers = 20;
        int count = 0;
        int number = 2;

        while (count < numbers) {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.println(number);
            }
            number++;
        }
    }
}
