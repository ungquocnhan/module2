package ss13_sort_algorithms.practice.setting_algorithms_sort_selection;

public class SortSelection {

    public static void sortSelection(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = 1;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMin != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

    }
}
