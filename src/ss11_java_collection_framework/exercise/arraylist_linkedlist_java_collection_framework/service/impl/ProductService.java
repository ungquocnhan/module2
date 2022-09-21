package ss11_java_collection_framework.exercise.arraylist_linkedlist_java_collection_framework.service.impl;

import ss11_java_collection_framework.exercise.arraylist_linkedlist_java_collection_framework.model.Product;
import ss11_java_collection_framework.exercise.arraylist_linkedlist_java_collection_framework.service.IProductService;
import ss11_java_collection_framework.exercise.arraylist_linkedlist_java_collection_framework.utils.PriceComperatorIncrease;
import ss11_java_collection_framework.exercise.arraylist_linkedlist_java_collection_framework.utils.PriceComperatorDecrease;

import java.util.*;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct() {
        Product product = this.infoProduct();

        productList.add(product);
        System.out.println("Thêm mới thành công.");
    }

    @Override
    public void editProduct() {
        System.out.print("Nhập mã sản phẩm bạn muốn sửa : ");
        String codeEdit = scanner.nextLine();
        boolean flagDelete = false;
        String nameEdit;
        double priceEdit;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCode().equals(codeEdit)) {
                System.out.print("Nhập tên sản phẩm bạn muốn sửa : ");
                nameEdit = scanner.nextLine();
                productList.get(i).setName(nameEdit);
                System.out.print("Nhập giá sản phẩm bạn muốn sửa : ");
                priceEdit = Double.parseDouble(scanner.nextLine());
                productList.get(i).setPrice(priceEdit);
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy sản phẩm cần sửa.");
        }
    }

    @Override
    public void removeProduct() {
        System.out.print("Nhập mã sản phẩm bạn muốn xóa : ");
        String codeDelete = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCode().equals(codeDelete)) {
                System.out.println("Bạn có chắc muốn xóa sản phẩm này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    productList.remove(i);
                    System.out.println("Xóa sản phẩm thành công.");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy sản phẩm cần xóa.");
        }
    }

    @Override
    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct() {
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

    @Override
    public void sortProductDecrease() {
        PriceComperatorDecrease priceComperatorDecrease = new PriceComperatorDecrease();
        productList.sort(priceComperatorDecrease);
        displayProduct();
    }

    @Override
    public void sortProductIncrease() {
        PriceComperatorIncrease priceComperatorIncrease = new PriceComperatorIncrease();
        productList.sort(priceComperatorIncrease);
        displayProduct();
    }

    private Product infoProduct() {
        System.out.print("Nhập mã sản phẩm : ");
        String code = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm : ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá bán sản phẩm : ");
        Double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(code, name, price);
        return product;
    }
}
