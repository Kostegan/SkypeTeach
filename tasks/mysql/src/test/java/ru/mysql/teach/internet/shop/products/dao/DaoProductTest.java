package ru.mysql.teach.internet.shop.products.dao;
import org.junit.Test;
import ru.mysql.teach.internet.shop.dao.DaoDataBase;
import ru.mysql.teach.internet.shop.dao.IDaoDataBase;

import java.sql.SQLException;

import static org.junit.Assert.*;

/**
 *
 */
public class DaoProductTest {
    private IDaoDataBase createDaoDataBase(){
        return new DaoDataBase();
    }
    @Test
    public void getNameProduct()throws SQLException{
        IDaoProduct daoProduct = new DaoProduct(createDaoDataBase());
        assertEquals("The product-name is: ","book", daoProduct.getProductById(1).getName());
        assertEquals("The product-type is: ","SCHOOL_SUPPLIES", daoProduct.getProductById(1).getProductType().getTypeName());
    }
}
