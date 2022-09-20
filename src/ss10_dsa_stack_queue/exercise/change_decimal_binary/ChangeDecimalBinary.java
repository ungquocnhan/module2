package ss10_dsa_stack_queue.exercise.change_decimal_binary;

import java.util.Scanner;
import java.util.Stack;

public class ChangeDecimalBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> integerStack = new Stack<>();
        System.out.print("Enter decimal : ");
        int decimal = Integer.parseInt(scanner.nextLine());
        while (decimal > 0) {
            int surplus = decimal % 2;
            integerStack.push(surplus);
            decimal = decimal / 2;
        }
        System.out.println("Decimal to Binary");
        int size = integerStack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(integerStack.pop());
        }
    }
}
