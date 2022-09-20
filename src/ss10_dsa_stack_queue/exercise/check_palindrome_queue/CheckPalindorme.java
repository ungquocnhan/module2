package ss10_dsa_stack_queue.exercise.check_palindrome_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindorme {
    public static void main(String[] args) throws InterruptedException {
        String str = "Able was I ere I saw Elba";
        String[] strings = str.toLowerCase().split("");
        Stack<String> stringStack = new Stack<>();
        Queue<String> stringQueue = new LinkedList<>();

        for (String stack : strings) {
            stringStack.push(stack);
        }

        for (String string : strings) {
            stringQueue.offer(string);
        }
        int count = 0;
        for (int i = 0; i < stringStack.size()-1; i++) {
            if (stringStack.pop().equals(stringQueue.poll())) {
                count++;
            }
        }
        if (count == strings.length / 2) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
