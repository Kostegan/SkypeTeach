package ru.comparable.skype.product;

import org.junit.Test;
import ru.comparable.skype.product.Product;
import ru.comparable.skype.product.ProductComparatorByName;

import static org.junit.Assert.*;

/**
 *
 */
public class ProductTest {


    @Test
    public void compareTwoEqualsProductsName() {
        Product product1 = new Product("Book", 22);
        Product product2 = new Product("Book", 22);
        assertEquals("Product1 name is more then the product2 name", 0, product1.compareTo(product2));
    }

    @Test
    public void compareTwoProductNames() {
        Product product1 = new Product("Book", 22);
        Product product2 = new Product("Bear", 45);
        assertEquals("Product1 name is more then the product2 name", 1, product1.compareTo(product2));
    }

    @Test
    public void compareTwoProductNames2() {
        Product product1 = new Product("Bear", 45);
        Product product2 = new Product("Book", 22);
        assertEquals("Product1 name is more then the product2 name", -1, product1.compareTo(product2));
    }

    @Test
    public void compareNamesDifferentLength() {
        Product product1 = new Product("Pen", 45);
        Product product2 = new Product("Magazine", 22);
        assertEquals("Product1 name is more then the product2 name", 1, product1.compareTo(product2));
    }

    @Test
    public void compareNamesDifferentLength2() {
        Product product1 = new Product("Picture", 45);
        Product product2 = new Product("Ball", 22);
        assertTrue("Value of name1 is more then name2", product1.compareTo(product2) > 1); // уточнить можно так тестировать?
    }

    @Test
    public void compareNameIsLessLength() {
        Product product1 = new Product("Ba", 45);
        Product product2 = new Product("Ball", 22);
        assertEquals("Name1 and name2 is equals", 0, product1.compareTo(product2)); // уточнить что делать если имя1 короче
    }

    @Test
    public void compareNameIsMoreLength() {
        Product product1 = new Product("Ball", 45);
        Product product2 = new Product("Ba", 22);
        assertEquals("Name1 and name2 is equals",0, product1.compareTo(product2) ); // уточнить что делать если имя2 короче
    }

    //todo
    @Test
    public void compareNameSecondIsEmpty() {
        Product product1 = new Product("Ball", 45);
        Product product2 = new Product("", 22);
        assertEquals("Name1 and name2 is equals",0, product1.compareTo(product2) ); // уточнить что делать если имя2 короче
    }


    //todo
    @Test
    public void compareNameFirstIsEmpty() {
        Product product1 = new Product("", 45);
        Product product2 = new Product("sdsd", 22);
        assertEquals("Name1 and name2 is equals",-1, product1.compareTo(product2) ); // уточнить что делать если имя2 короче
    }

}
