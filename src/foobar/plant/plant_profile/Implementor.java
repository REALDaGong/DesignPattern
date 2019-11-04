package foobar.plant.plant_profile;


import foobar.product.product_interface.BaseProduct;
import javafx.util.Pair;

import java.util.*;

/**
 * 桥接模式
 */
public interface Implementor {


    /**
     * @return
     */
    public ArrayList<BaseProduct> getDrop();

}