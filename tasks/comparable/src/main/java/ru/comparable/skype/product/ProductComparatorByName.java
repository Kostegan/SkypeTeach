package ru.comparable.skype.product;

import java.util.Comparator;

/**
 *
 */
public class ProductComparatorByName implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        int name2length = p2.getName().length();
        for (int i = 0; i < p1.getName().toCharArray().length; i++) {
            int result = 0;
            name2length--;
            result = p1.getName().charAt(i) - p2.getName().charAt(i);
            if (result!=0 || name2length==0){
                return result;
            }
        }
        return 0;
    }
}
