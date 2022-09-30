package ss16_binary_file.exercise.manage_product_binary_file.service.impl;

import ss16_binary_file.exercise.manage_product_binary_file.model.Product;
import ss16_binary_file.exercise.manage_product_binary_file.service.IProductService;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    public static final String LIST_PRODUCT = "F:/CODEGYM/module_2/src/ss16_binary_file/exercise/manage_product_binary_file/data/product.csv";
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public void addProduct() {
        productList = readFileList();
        Product product = this.infoProduct();

        productList.add(product);
        writeFileList(productList);
        System.out.println("Nhập thành công");
    }

    @Override
    public void displayProduct() {
        productList = readFileList();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct() {
        productList = readFileList();
        System.out.print("Nhập tên sản phẩm bạn muốn tìm kiếm : ");
        String nameSearch = scanner.nextLine();
        boolean flagSearch = false;
        for (Product product : productList) {
            if (product.getName().contains(nameSearch)) {
                flagSearch = true;
                System.out.println(product.toString());
            }
        }
        if (!flagSearch) {
            System.out.println("Không có sản phẩm nào được tìm thấy.");
        }
    }

    private Product infoProduct() {
        System.out.print("Nhập id của sản phẩm : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm : ");
        String name = scanner.nextLine();
        System.out.print("Nhập tên hãng sản xuất : ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập giá bán sản phẩm : ");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập màu sắc sản phẩm : ");
        String color = scanner.nextLine();
        System.out.print("Nhập ngày sản xuất ra sản phẩm : ");
        LocalDate dateOfManufacture = LocalDate.parse(scanner.nextLine(), formatter);
        Product product = new Product(id, name, manufacturer, price, color, dateOfManufacture);
        return product;
    }

    private List<Product> readFileList() {
        List<Product> productList;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(LIST_PRODUCT);
            objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            productList = new ArrayList<>();
            return productList;
        }
        try {
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productList;
    }

    private void writeFileList(List<Product> productList) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(LIST_PRODUCT);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
