package foobar.plant.farm;

import foobar.plant.consumable.item.Fertilizer;

import java.util.*;

/**
 *  植物会”观察“肥料施加到土地上的事件
 */
public interface AddFertilizerEventObserver {

    /**
     * 
     */
    public void FertilizerAdded(Fertilizer type);

}