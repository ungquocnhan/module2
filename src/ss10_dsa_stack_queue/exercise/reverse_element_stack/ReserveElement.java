package ss10_dsa_stack_queue.exercise.reverse_element_stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReserveElement {
    public static <Char> void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        System.out.println(integerList);
        for (int i = 0; i < integerList.size(); i++) {
            integerStack.push(integerList.get(i));
        }
        System.out.println(integerStack);
        integerList.clear();

        for (int i = 1; i < integerStack.size() + i; i++) {
            int peek = integerStack.pop();
            integerList.add(peek);
        }
        System.out.println(integerList);

        System.out.println("\n");

        String str = "ung quoc nhan";
        char[] str1 = str.toCharArray();
        System.out.println(Arrays.toString(str1));
        Stack<Character> stringStack= new Stack<>();
        for (char s : str1) {
            stringStack.push(s);
        }
        for (int i = 0; i < str1.length ; i++) {
            str1[i] = stringStack.pop();
        }
        System.out.println(Arrays.toString(str1));
    }
}

