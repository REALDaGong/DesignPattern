package foobar.plant.farm;

import java.util.*;

import foobar.plant.consumable.item.Fertilizer;

/**
 * 组合模式
 */
public interface Plantable {


    /**
     * 
     */
    public void plow();

    /**
     * @param type
     */
    public void addFertilizer(Fertilizer type);

}