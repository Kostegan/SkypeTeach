package ru.teach.skype.work.shop.bicycle;

/**
 * This class describe an element into shop.
 * IProduct has fields nameProduct, priceProduct and sizeProduct.
 */
public class Product {
    private String nameProduct;
    private double priceProduct;
    private double sizeProduct;

    public Product(String name,double price,double size){
        setNameProduct(name);
        setPriceProduct(price);
        setSizeProduct(size);
    }

    public void setNameProduct(String name){
        nameProduct = name;
    }

    public String getNameProduct(){
        return nameProduct;
    }

    public void setPriceProduct(double price){
        priceProduct = price;
    }

    public double getPriceProduct(){
        return priceProduct;
    }

    public void setSizeProduct(double size){
        sizeProduct = size;
    }

    public double getSizeProduct(){
        return sizeProduct;
    }
}
