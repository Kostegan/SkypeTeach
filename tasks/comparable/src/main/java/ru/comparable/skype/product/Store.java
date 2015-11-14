package ru.comparable.skype.product;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class Store{

               List<Product> products = Arrays.asList(
                        new Product("Book", 150),
                        new Product("Book",106),
                        new Product("XBox",706),
                        new Product("Audio",312),
                        new Product("Pen",10),
                        new Product("Game",80),
                        new Product("Bear",60),
                        new Product("Car",78));
                // todo Sort by name
//                List<Product> productsSortedByName = null;

//                Collections.sort(products);
//                Collections.sort(products, productComparatorByPrice);
//                List<Product> productsSortedByPrice = products;
//                System.out.println("Sorted by price: " + productsSortedByPrice);

        public void sortByPrice(){
                Collections.sort(products);
                System.out.println("Sorted by price: " + products.toString());
        }

        public Product getProduct(int i){
                return products.get(i);
        }


}
