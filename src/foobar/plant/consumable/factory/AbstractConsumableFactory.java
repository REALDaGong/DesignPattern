package foobar.plant.consumable.factory;

import java.util.*;

import foobar.plant.consumable.item.*;

/**
 *  消耗品(农药和化肥的抽象基类，抽象工厂)
 */
public abstract class AbstractConsumableFactory {
    /**
     * @return 农药对象
     */
    public abstract Pesticide getPesticide();

    /**
     * @return 化肥对象
     */
    public abstract Fertilizer getFertilizer();

}