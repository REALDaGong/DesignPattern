package foobar.product.drop_list;

import foobar.product.product_interface.BaseProduct;
import javafx.util.Pair;

/**
 * 
 */
public interface ProductIterable {

    /**
     * @param obj
     */
    public void add(Pair<BaseProduct, Float> obj);

    /**
     * @param obj
     */
    public void remove(Pair<BaseProduct, Float> obj);

    /**
     * @return
     */
    public ProductIterator getIterator();

}