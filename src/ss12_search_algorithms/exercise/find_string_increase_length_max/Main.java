package ss12_search_algorithms.exercise.find_string_increase_length_max;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = scanner.nextLine();
        List<Character> max = new ArrayList<>();
        Stack<Character> characterList = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            characterList.push(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > characterList.peek()) {
                    characterList.push(str.charAt(j));
                }
            }
            if (characterList.size() > max.size()) {
                max.clear();
                max.addAll(characterList);
            }
            characterList.clear();
        }
        for (Character character : max) {
            System.out.print(character);
        }
    }
}
