package foobar.product;

import foobar.product.product_interface.BaseProduct;

/**
 * 
 */
public abstract class BaseFactory {

    /**
     * Default constructor
     */
    public BaseFactory() {
    }

    public abstract BaseProduct getPlant(String plant);
    public abstract BaseProduct getAnimal(String animal);


}