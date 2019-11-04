package foobar.plant.plant_profile;

import java.util.*;

import foobar.plant.period.*;
import foobar.plant.plant_entity.BasePlant;
import foobar.product.drop_list.*;
import foobar.product.product_interface.BaseProduct;

/**
 * 一种植物的基本属性的基类
 */
public abstract class BasePlantProfile {

    /**
     * Default constructor
     */
    protected ProductDropList product=null;

    public abstract String getName();

    public abstract Period getFirstPeriod();

    public abstract int getThirsty();

    public abstract int getHealth();

    public abstract ProductDropList getDropList();
    /**
     * @return 一个列表，里面是收获成果
     */
    public ArrayList<BaseProduct> getProduct() {
        if (product==null){
            System.out.println("no product aligned to the plant.");
            return new ArrayList<BaseProduct>();
        }
        ArrayList<BaseProduct> list=product.getDrop();
        return list;
    }
}