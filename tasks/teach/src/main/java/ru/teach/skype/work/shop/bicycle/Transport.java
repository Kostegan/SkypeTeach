package ru.teach.skype.work.shop.bicycle;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Transport {
    private String numberName;
    private double maxSizeTransport;
    private List<Product> list = new ArrayList<>();

    public Transport(String numberName, double maxSize){
        setNumberName(numberName);
        setMaxSizeTransport(maxSize);
    }

    public void setNumberName(String numberName){
        this.numberName = numberName;
    }

    public String getNumberName(){
        return numberName;
    }

    public void setMaxSizeTransport(double maxSizeTransport){
        this.maxSizeTransport = maxSizeTransport;
    }

    public double getMaxSizeTransport(){
        return maxSizeTransport;
    }

    public void addProduct(Product product){
        list.add(product);
    }
}
