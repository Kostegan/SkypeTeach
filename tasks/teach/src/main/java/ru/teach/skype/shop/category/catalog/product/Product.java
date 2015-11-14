package ru.teach.skype.shop.category.catalog.product;

import ru.teach.skype.shop.category.catalog.product.ProductException.IllegalProductException;

/**
 *
 */
public class Product implements IProduct {
    private String name;

    /**
     * Empty constructor.
     */
    public Product(){

    }

    /**
     * Constructor set name
     */
    public Product(String name)throws IllegalProductException{
        setName(name);
    }

    public void setName(String name) throws IllegalProductException{
        if(name!=""){
            this.name = name;
        } else {
            throw new IllegalProductException("Field the name cannot be empty.");
        }

    }
    public String getName(){
        return name;
    }

}
