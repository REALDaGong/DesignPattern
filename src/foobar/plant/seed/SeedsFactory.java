package foobar.plant.seed;
import logger.logger;
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
        logger.println(this.getClass().getName()+"不能产生特别的种子.");
        return produceSeeds();
    }

    /**
     * 产生普通种子
     */
    public abstract SeedBag produceSeeds();

}