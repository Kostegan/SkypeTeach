package ru.mysql.teach.internet.shop.products.dao;

import ru.mysql.teach.internet.shop.dao.AbstractDaoEntity;
import ru.mysql.teach.internet.shop.dao.IDaoDataBase;
import ru.mysql.teach.internet.shop.products.product.IProduct;
import ru.mysql.teach.internet.shop.products.product.Product;
import ru.mysql.teach.internet.shop.products.product.type.TypeEnum;

import java.sql.SQLException;
import java.util.List;

/**
 *
 */
public class DaoProduct extends AbstractDaoEntity implements IDaoProduct {

    public DaoProduct(IDaoDataBase daoDataBase){
        super(daoDataBase);
    }

    @Override
    public void addProduct(IProduct product) {

    }

    /**
     * Gets a product by specified id.
     * @param id product that needs find.
     * @return product from base
     */
    @Override
    public IProduct getProductById(int id) throws SQLException {
        return convertListToProduct(getDaoDataBase().executeCallableStatement(id));
    }

    private IProduct convertListToProduct(List<Object> temp){
        String pName =(String) temp.get(0);
        int pType =(Integer) temp.get(1);
        TypeEnum productType = TypeEnum.valueOf(pType);
        IProduct product = new Product(pName,productType);  // спросить
        return product;
    }

}
