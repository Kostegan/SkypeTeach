package ru.comparable.skype.product;

import org.junit.Test;
import ru.comparable.skype.product.Product;
import ru.comparable.skype.product.ProductComparatorByName;
import ru.comparable.skype.product.Store;
import static org.junit.Assert.*;


/**
 *
 */
public class ProductComparatorByNameTest {

    @Test
    public void CompareByName(){
        Store store = new Store();
        Product product1 = store.getProduct(0);
        Product product2 = store.getProduct(4);
        ProductComparatorByName compareByName = new ProductComparatorByName();
        assertEquals("1",1,compareByName.compare(product1,product2));

    }
}
