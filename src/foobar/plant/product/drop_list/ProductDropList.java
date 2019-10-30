package foobar.plant.product.drop_list;

import java.util.*;

import foobar.plant.plant_profile.*;
import foobar.plant.product.*;
import javafx.util.Pair;

/**
 * 产品列表的基类，可以让一种植物有多种产品
 */
public class ProductDropList implements ProductIterable, Implementor {

    /**
     * Default constructor
     */
    public ProductDropList() {
    }

    /**
     * TODO:补充定义
     */
    private Set<Pair<BaseProduct,Float>> productList;

    /**
     * 
     */
    private String name;


    /**
     * @return
     */
    public ProductDropListIterator getIterator() {
        // TODO implement here
        return null;
    }

    /**
     * @param result 
     * @param chance
     */
    public void addProduct(BaseProduct result, float chance) {
        // TODO implement here
    }

    /**
     * @param index
     */
    public void removeProduct(int index) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Set<Object> getDrop() {
        // TODO implement here
        return null;
    }

    /**
     * @param obj
     */
    public void add(Object obj) {
        // TODO implement here
    }

    /**
     * @param obj
     */
    public void remove(Object obj) {
        // TODO implement here
    }

}