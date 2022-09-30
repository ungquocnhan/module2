package ss16_binary_file.exercise.manage_product_binary_file.controller;

import ss16_binary_file.exercise.manage_product_binary_file.service.IProductService;
import ss16_binary_file.exercise.manage_product_binary_file.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductService iProductService = new ProductService();

    public static void menuManageProduct() {
        while (true) {
            System.out.println("Chương trình quản lý sản phẩm");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị thông tin sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Thoát");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.displayProduct();
                    break;
                case 3:
                    iProductService.searchProduct();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
