package ss12_search_algorithms.practice.calculate_complexity_algorithms;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:");
        String inputString = scanner.nextLine();

        int[] frequentChar = new int[255];                   // O(1)
        for (int i = 0; i < inputString.length(); i++) {     // O((n).1) = O(n) => n do dai chuoi ky tu
            int ascii = inputString.charAt(i);               // O(1)
            frequentChar[ascii] += 1;                        // O(1)
        }

        int max= 0;                                          // O(1)
        char character = 255;                                // O(1)
        for (int i = 0; i < 255 ; i++) {                     // 0((255).1) = 0(255)
            if(frequentChar[i] > max){                       // O(1)
                max = frequentChar[i];                       // O(1)
                character = (char) i;                        // O(1)
            }
        }
        System.out.println("The most appearing letter is '" + character
                + "' with a frequency of " + max + " times");
    }
}
