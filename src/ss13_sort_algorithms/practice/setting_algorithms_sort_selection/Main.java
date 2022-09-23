package ss13_sort_algorithms.practice.setting_algorithms_sort_selection;

import static ss13_sort_algorithms.practice.setting_algorithms_sort_selection.SortSelection.sortSelection;

public class Main {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        sortSelection(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
