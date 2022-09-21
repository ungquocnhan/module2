package ss11_java_collection_framework.exercise.arraylist_linkedlist_java_collection_framework.controller;

import java.util.Scanner;

public class SortController extends ProductController {

    public static void menuSort() {
        while (true) {
            System.out.println("Chọn cách bạn muốn sắp xếp");
            System.out.println("1. Sắp xếp giẩm dần");
            System.out.println("2. Sắp xếp tăng dần");
            System.out.println("3. Quay lại menu chính");

            int choiceSort = Integer.parseInt(scanner.nextLine());

            switch (choiceSort) {
                case 1:
                    iProductService.sortProductDecrease();
                    break;
                case 2:
                    iProductService.sortProductIncrease();
                    break;
                case 3:
                    return;
            }
        }
    }
}
