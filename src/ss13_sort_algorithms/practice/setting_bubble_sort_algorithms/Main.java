package ss13_sort_algorithms.practice.setting_bubble_sort_algorithms;

import static ss13_sort_algorithms.practice.setting_bubble_sort_algorithms.BubbleSort.bubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

        bubbleSort(list);
        for (int value : list) {
            System.out.print(value + " ");

        }
    }
}
