package ss10_dsa_stack_queue.exercise.check_bracket_stack;

import ss10_dsa_stack_queue.practice.stack_use_arraylist.MyStack;

import java.io.Serializable;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        String string = "s * s – a) * (s – b) * (s – c) ";

        System.out.println(checkBracket(string));
    }

    public static String checkBracket(String string) {
        Stack<Character> bStack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char sym = string.charAt(i);
            if (sym == '(') {
                bStack.push(sym);
            } else if (sym == ')') {
                if (bStack.isEmpty()) {
                    return "Not well";
                } else {
                    char left = bStack.pop();
                    if (!isPair(left,sym)) {
                        return "Not well";
                    }
                }
            }
        }
        if (bStack.isEmpty()) {
            return "Well";
        } else {
            return "Not well";
        }
    }

    public static boolean isPair(char character1, char character2) {
        if (character1 == '(' && character2 == ')') {
            return true;
        }else {
            return false;
        }
    }
}


