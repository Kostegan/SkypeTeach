package ru.teach.skype.shop.category.catalog;

import ru.teach.skype.shop.category.catalog.product.IProduct;

/**
 * Class has a list products. You can add and deleted product to list.
 */
public interface ICatalogProduct {
    /**
     * Adds a product to list.
     */
    public void addProduct(IProduct product);

    /**
     * Removes a specified product from a list.
     */
    public void removeProduct(IProduct product);

}
