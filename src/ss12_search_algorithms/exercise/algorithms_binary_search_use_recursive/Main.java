package ss12_search_algorithms.exercise.algorithms_binary_search_use_recursive;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size : ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));

        System.out.print("Enter a key search : ");
        int key = Integer.parseInt(scanner.nextLine());
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.print(binarySearch(array, key, 0, array.length - 1));


    }

    static int binarySearch(int[] arr, int value, int left, int right) {
        if (right >= left) {
            int mid = (right + left) / 2;

            if (arr[mid] == value) {
                return mid;
            }
            if (arr[mid] > value) {
                return binarySearch(arr, value, left, mid - 1);
            }
            return binarySearch(arr, value, mid + 1, right);
        }
        return -1;
    }
}

