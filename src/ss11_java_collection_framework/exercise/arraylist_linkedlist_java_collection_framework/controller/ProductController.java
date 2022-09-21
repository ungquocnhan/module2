package ss11_java_collection_framework.exercise.arraylist_linkedlist_java_collection_framework.controller;

import ss11_java_collection_framework.exercise.arraylist_linkedlist_java_collection_framework.service.IProductService;
import ss11_java_collection_framework.exercise.arraylist_linkedlist_java_collection_framework.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    protected static Scanner scanner = new Scanner(System.in);
    protected static IProductService iProductService = new ProductService();

    public static void menuProduct() {
        while (true) {
            System.out.println("Chương trình quản lý sản phẩm");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xoá sản phẩm");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Sắp xếp sản phẩm");
            System.out.println("7. Thoát");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.editProduct();
                    break;
                case 3:
                    iProductService.removeProduct();
                    break;
                case 4:
                    iProductService.displayProduct();
                    break;
                case 5:
                    iProductService.searchProduct();
                    break;
                case 6:
                    SortController.menuSort();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
