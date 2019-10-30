package foobar.plant.product.drop_list;

import java.util.*;

/**
 * 
 */
public interface ProductIterable {

    /**
     * @param obj
     */
    public void add(Object obj);

    /**
     * @param obj
     */
    public void remove(Object obj);

    /**
     * @return
     */
    public ProductIterator getIterator();

}