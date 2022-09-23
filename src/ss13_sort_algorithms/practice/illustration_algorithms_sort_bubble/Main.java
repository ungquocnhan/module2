package ss13_sort_algorithms.practice.illustration_algorithms_sort_bubble;


import java.util.Scanner;

import static ss13_sort_algorithms.practice.illustration_algorithms_sort_bubble.BubbleSort.bubbleSort;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nBegin sort processing...");
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        bubbleSort(list);
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
}
