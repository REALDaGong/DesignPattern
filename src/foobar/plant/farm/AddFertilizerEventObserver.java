package foobar.plant.farm;

import foobar.plant.consumable.item.Fertilizer;

import java.util.*;

/**
 * 
 */
public interface AddFertilizerEventObserver {

    /**
     * 
     */
    public void FertilizerAdded(Fertilizer type);

}