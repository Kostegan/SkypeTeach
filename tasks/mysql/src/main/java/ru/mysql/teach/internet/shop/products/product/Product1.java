package ru.mysql.teach.internet.shop.products.product;

import ru.mysql.teach.internet.shop.products.product.type.TypeEnum;

/**
 *
 */
public class Product1 implements IProduct {
    private String name;
    private TypeEnum type;

    public Product1() {
    }

    public Product1(String name, TypeEnum type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setProductType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public TypeEnum getProductType() {
        return type;
    }
}
