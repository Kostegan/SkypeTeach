package ru.mysql.teach.internet.shop.products.product;


import ru.mysql.teach.internet.shop.products.product.type.TypeEnum;

/**
 * Has various methods for creation new products.
 */
public interface IProduct {
    public void setName(String name);
    public String getName();

    public void setProductType(TypeEnum type);

    /**
     * @return name type of a product
     */
    public TypeEnum getProductType();
}
