package ru.mysql.teach.internet.shop.products.dao;

import ru.mysql.teach.internet.shop.products.product.IProduct;

import java.sql.SQLException;

/**
 * Has methods for a work with products in database.
 */
public interface IDaoProduct {

    /**
     * Adds a product to database.
     * @param product which will be added.
     */
    public void addProduct(IProduct product);

    /**
     * @param id product that needs find.
     * @return product by a specified id.
     */
    public IProduct getProductById(int id) throws SQLException;
}
