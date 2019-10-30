package foobar.plant.consumable.factory;

import java.util.*;

import foobar.plant.consumable.item.*;

/**
 * 
 */
public abstract class AbstractConsumableFactory {

    /**
     * Default constructor
     */
    public AbstractConsumableFactory() {
    }

    /**
     * @return
     */
    public abstract Pesticide getPesticide();

    /**
     * @return
     */
    public abstract Fertilizer getFertilizer();

}