package ru.teach.skype.shop.category.catalog.product;
import org.junit.Test;
import ru.teach.skype.shop.category.catalog.product.ProductException.IllegalProductException;

import static org.junit.Assert.*;

/**
 *
 */
public class ProductTest {
    private IProduct createProduct(){
        return new Product();
    }


    @Test
    public void getNameProduct()throws IllegalProductException{
        IProduct product = createProduct();
        product.setName("Soap");
        assertEquals("Product has name: Soap","Soap",product.getName());
    }

    @Test
    public void getNameProductNotAssigned(){
        IProduct product = createProduct();
        assertEquals("Product name is not set.",null,product.getName());
    }

    @Test (expected = IllegalProductException.class)
    public void setNameEmpty()throws IllegalProductException{
        IProduct product = createProduct();
        product.setName("");
    }

    @Test
    public void setNameToProduct()throws IllegalProductException{
        IProduct product = new Product("Pen");
        assertEquals("Set the product name: Pen", "Pen",product.getName());
    }
}
