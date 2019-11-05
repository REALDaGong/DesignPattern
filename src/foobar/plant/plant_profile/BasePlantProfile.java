package foobar.plant.plant_profile;
import logger.logger;
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

    //获取名称
    public abstract String getName();

    //获取第一阶段对象
    public abstract Period getFirstPeriod();

    //获取饥渴值
    public abstract int getThirsty();

    //获取健康值
    public abstract int getHealth();

    //获取掉落列表
    public abstract ProductDropList getDropList();
    /**
     * @return 一个列表，里面是收获成果
     */
    public ArrayList<BaseProduct> getProduct() {
        if (product==null){
            logger.println("no product aligned to the plant.");
            return new ArrayList<BaseProduct>();
        }
        ArrayList<BaseProduct> list=product.getDrop();
        return list;
    }
}