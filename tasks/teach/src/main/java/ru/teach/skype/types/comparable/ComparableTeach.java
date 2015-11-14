package ru.teach.skype.types.comparable;

import java.util.*;

/**
 *
 */
public class ComparableTeach {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("book", 12),
                new Product("book", 180),
                new Product("car", 5000),
                new Product("pencil", 5),
                new Product("game", 100),
                new Product("book", 35),
                new Product("bear", 50)
        );

//        String s1 = "abc"; // byte[] = {97, 98, 99}
//        char c1 = s1.charAt(0); // a
//        int i1 = c1; // 97
//        char c2 = s1.charAt(1); // b
//        boolean r = c1 < c2; //

        System.out.println(products.get(1).compareTo(products.get(0)));
        Comparator<Product> productComparatorByPrice = new ProductComparatorByPrice();
        Comparator<Product> productComparatorByName = new ProductComparatorByName();
        Comparator<Product> productComparatorByNameAndPrice = new ProductComparatorByNameAndPrice();
        System.out.println(productComparatorByPrice.compare(products.get(1), products.get(0)));

        // todo Sort by name
        Collections.sort(products);
        List<Product> productsSortedByName = products;
        System.out.println("Sorted by names: " + productsSortedByName);


        // todo Comparator Sort by name
        Collections.sort(products, productComparatorByName);
        List<Product> productsComparatorSortedByName = products;
        System.out.println("Comparator sorted by name: " + productsSortedByName);


        // todo Sort by price
//        Collections.sort(products);
        Collections.sort(products, productComparatorByPrice);
        List<Product> productsSortedByPrice = products;
        System.out.println("Sorted by price: " + productsSortedByPrice);

        // todo Sort by name and price
        Collections.sort(products,productComparatorByNameAndPrice);
        List<Product> productsSortedByNameAndPrice = products;
        // todo
        System.out.println("Sorted by name and price: " + productsSortedByNameAndPrice);
    }
}

class Product implements Comparable<Product> {
    private int price;
    private String name;

    public Product(String name, int price) {
        this.price = price;
        this.name = name;
    }


    @Override
    public int compareTo(Product p) {
        int name2length = p.getName().length();
        for (int i = 0; i < name.toCharArray().length; i++) {
            int result = 0;
            name2length--;
            result = name.charAt(i) - p.getName().charAt(i);
            if (result != 0 || name2length == 0) {
                return result;
            }
        }
        return 0;
    }


//    @Override
//    public int compareTo(Product p) {
//
////        return price - p.getPrice();
//        if (price < p.getPrice()) {
//            return -1;
//        }
//        if (price > p.getPrice()) {
//            return 1;
//        }
//        return 0;
//    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "=" + price;
    }
}

class ProductComparatorByPrice implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getPrice() - p2.getPrice();
    }
}

class ProductComparatorByNameAndPrice implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        ProductComparatorByName compareByName = new ProductComparatorByName();
        ProductComparatorByPrice compareByPrice = new ProductComparatorByPrice();
        int resultCompareName = compareByName.compare(p1,p2);
        if(resultCompareName!=0){
            return resultCompareName;
        }
        return compareByPrice.compare(p1,p2); // todo implement
    }
}

class ProductComparatorByName implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
