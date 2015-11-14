package ru.teach.skype.types;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 */
public class MapTeach {
    public static void main(String[] args) {
        Map<String, Product> products = new TreeMap<>();
        products.put("tv", new Product("super televisor"));
        products.put("phone", new Product("iphone 4+"));

        String name = "phone";

        Product product = products.get(name);
        System.out.println(product.getDescription());
    }

    public static class Product {
        String description;
        int price;
        String vendor;

        public Product(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
