package ru.teach.skype.work.shop.bicycle;

import ru.teach.skype.work.shop.bicycle.exception.TooManyMassException;

/**
 * This class describe a loader. The loader can load product to a transport.
 * Loader defines max size a transport.
 */
public class Loader {

    /**
     * Checks amount products in a basket.
     * Removes products from basket and puts their to car
     * @param car for loading
     * @param basket where takes product
     */
    public void loading(Transport car, Basket basket) throws TooManyMassException{
        validate(car,basket);
        for(int i = 0; i != basket.getBasketSize();){
            car.addProduct(basket.getProduct(i));
            basket.removeProduct(i);
        }
    }

    /**
     * Checks number product in a basket.
     * Method check transport maxSize.
     */
    public void validate(Transport car, Basket basket) throws TooManyMassException{
        if(car!= null && basket != null){
            if(car.getMaxSizeTransport()>= basket.getHeight()){

            } else {
                throw new TooManyMassException("Mass products is more big");
            }
        } else {
            // some code;
        }
    }
}
