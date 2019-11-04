package foobar.plant.seed;

import java.util.*;

import foobar.plant.plant_entity.*;

/**
 *  工厂方法,产品是seedbag
 */
public abstract class SeedsFactory {
    /**
     * @param quailty 前缀.
     *                这里应用了建造者模式
     */
    public SeedBag produceSeedsWithSpecialQuailty(QuailtyConstructor quailty) {
        System.out.println(this.getClass().getName()+"不能产生特别的种子.");
        return produceSeeds();
    }

    /**
     * 
     */
    public abstract SeedBag produceSeeds();

}