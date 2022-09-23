package ss13_sort_algorithms.exercise.illustration_algorithms_sort_insert;

public class IllustrationSortInsert {
    public static void sortInsert(int[] list) {
        int pos;
        int key;
        for (int i = 1; i < list.length; i++) {
            key = list[i];
            pos = i;
            while (pos > 0 && key < list[pos - 1]) {
                System.out.println("Insert " + key + " with " + list[pos - 1]);
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = key;

            System.out.print("List after the  " + i + " sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
