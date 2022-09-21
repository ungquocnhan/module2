package ss11_java_collection_framework.exercise.arraylist_linkedlist_java_collection_framework.utils;

import ss11_java_collection_framework.exercise.arraylist_linkedlist_java_collection_framework.model.Product;

import java.util.Comparator;

public class PriceComperatorDecrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return -1;
        } else if (o1.getPrice().equals(o2.getPrice())) {
            return o2.getName().compareTo(o1.getName());
        } else {
            return 1;
        }
    }
}
