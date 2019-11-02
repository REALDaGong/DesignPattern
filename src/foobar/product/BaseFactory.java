package foobar.product;

import foobar.product.product_interface.BaseProduct;
import foobar.Building.StoreHouse;

/**
 * 
 */
public abstract class BaseFactory {

    /**
     * Default constructor
     */
    public BaseFactory() {
    }

    public abstract BaseProduct getPlant(String plant, StoreHouse store);
    public abstract BaseProduct getAnimal(String animal, StoreHouse store);


}