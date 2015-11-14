package ru.teach.skype.shop.engine;

import ru.teach.skype.shop.catalog.basket.IBasket;
import ru.teach.skype.shop.catalog.basket.archive.IArchiveBasket;

/**
 * Gets a specified basket.
 */
public interface IShopEngine {


    /**
     * Moves a product from basket to archive basket
     */
    public void doShopping(IBasket basket,IArchiveBasket archiveBasket);

}
