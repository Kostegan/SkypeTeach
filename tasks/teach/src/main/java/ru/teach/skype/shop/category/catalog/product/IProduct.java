package ru.teach.skype.shop.category.catalog.product;

import ru.teach.skype.shop.category.catalog.product.ProductException.IllegalProductException;

/**
 * Class the product represent one item, which can select and add in a basket.
 * IProduct has fields a name and amount items.
 * You can get the name produce and amount items
 */
public interface IProduct {

    /**
     *
     * @param name which will be set to field a name.
     * @throws IllegalProductException if set name is empty.
     */
    public void setName(String name)throws IllegalProductException;

    /**
     * @return name which set to field the name
     */
    public String getName();
}
