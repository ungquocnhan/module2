package ss12_search_algorithms.exercise.fìnd_string_lengthest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "abcabcdgabmnsxy";
        List<Character> characterMax = new ArrayList<>();
        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            characterStack.push(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > characterStack.peek()) {
                    characterStack.push(str.charAt(j));
                }else {
                    break;
                }
            }
            if (characterStack.size() > characterMax.size()) {
                characterMax.clear();
                characterMax.addAll(characterStack);
            }
            characterStack.clear();
        }
        for (Character character : characterMax) {
            System.out.print(character);
        }
    }
}
