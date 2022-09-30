package ss16_binary_file.exercise.manage_product_binary_file.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Product implements Serializable {
    private int id;
    private String name;
    private String manufacturer;
    private Double price;
    private String color;
    private LocalDate dayOfManufacture;

    public Product() {
    }

    public Product(int id, String name, String manufacturer, Double price, String color, LocalDate dayOfManufacture) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.color = color;
        this.dayOfManufacture = dayOfManufacture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getDayOfManufacture() {
        return dayOfManufacture;
    }

    public void setDayOfManufacture(LocalDate dayOfManufacture) {
        this.dayOfManufacture = dayOfManufacture;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", dayOfManufacture=" + dayOfManufacture +
                '}';
    }
}


