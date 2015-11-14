package ru.teach.skype.shop.category;

import ru.teach.skype.shop.category.catalog.ICatalogProduct;

/**
 * Class has list catalogs products.
 */
public interface ICategoryCatalog {

    /**
     *  Sets the specified name for a category.
     */
    public void setName(String name);

    /**
     * Gets the name a category.
     */
    public String getName();

    /**
     * Adds catalog of product to the list.
     */
    public void addCatalogProduct(ICatalogProduct catalogProduct);

    /**
     * Removes the specified catalog of product from a list.
     */
    public void removeCatalogProduct(ICatalogProduct catalogProduct);

    /**
     * Changes the catalog.
     */
    public void changeCatalogProduct(ICatalogProduct catalogProduct);
}
