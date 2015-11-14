package ru.teach.skype.work.shop.bicycle;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Basket {
    private List<Product> list = new ArrayList<>();
    private double height;

    public Basket(){

    }

    public int getBasketSize(){
        return list.size();
    }

    public Product getProduct(int i){
        return list.get(i);
    }

    public void addProduct(Product product){
        height += product.getSizeProduct();
        list.add(product);
    }

    public double getHeight(){
        return height;
    }

    public void removeProduct(int i){
        list.remove(i);
    }

    public double weightInBasket(){
        return 0;
    }


}
