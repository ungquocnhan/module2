package ss11_java_collection_framework.exercise.arraylist_linkedlist_java_collection_framework.model;

public class Product {
    private String code;
    private String name;
    private Double price;

    public Product(String code, String name, Double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product " +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price;
    }


}
