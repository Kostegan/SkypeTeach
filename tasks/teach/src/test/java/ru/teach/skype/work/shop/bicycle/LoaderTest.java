package ru.teach.skype.work.shop.bicycle;

import org.junit.Test;
import ru.teach.skype.work.shop.bicycle.exception.TooManyMassException;

/**
 *
 */
public class LoaderTest {

    @Test
    public void loader() {
        Loader loader = new Loader();
        Product bicycle1 = new Product("Stals", 25, 15);
        Product bicycle2 = new Product("Neto", 55, 30);
        Transport transport = new Transport("11", 121);
        Basket basket = new Basket();
        basket.addProduct(bicycle1);
        basket.addProduct(bicycle1);
        basket.addProduct(bicycle1);
        basket.addProduct(bicycle2);
        basket.addProduct(bicycle2);
        basket.addProduct(bicycle2);
        try {
            loader.loading(transport, basket);
        } catch (TooManyMassException e) {
            System.out.println("Weight in basket is more than you can put to transport.");
        }
    }
}
