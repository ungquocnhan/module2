package ss10_dsa_stack_queue.exercise.count_appear_map;

import java.util.Arrays;
import java.util.TreeMap;

public class CountAppear {
    public static void main(String[] args) {
        String str = "It will eliminate and return a key-value mapping associated with the greatest key in this map, or null if the map is empty";
        String[] str1 = str.toLowerCase().split(" ");

        TreeMap<String, Integer> map = new TreeMap<>();
        for (String key : str1) {
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
//                Integer value = map.get(key);
//                value++;
//                map.replace(key, value);
                map.put(key, map.get(key) + 1);
            }
        }
        System.out.println(map);

    }
}
