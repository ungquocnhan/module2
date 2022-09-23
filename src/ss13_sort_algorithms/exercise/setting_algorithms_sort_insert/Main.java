package ss13_sort_algorithms.exercise.setting_algorithms_sort_insert;

import java.util.Scanner;

import static ss13_sort_algorithms.exercise.setting_algorithms_sort_insert.SortInsert.sortInsert;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        sortInsert(list);
        for(int element : list){
            System.out.print(element + "\t");
        }
    }
}
