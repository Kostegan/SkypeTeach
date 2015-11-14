package ru.comparable.skype.product;

import org.junit.Test;
import ru.comparable.skype.product.Store;

import static org.junit.Assert.*;
/**
 *
 */
public class StoreTest {

    @Test
    public void storeSort(){
        Store store = new Store();
        store.sortByPrice();
    }

}
