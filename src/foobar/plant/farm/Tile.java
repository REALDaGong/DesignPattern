package foobar.plant.farm;

import java.util.*;

import foobar.plant.consumable.effect.*;
import foobar.plant.consumable.item.*;
import foobar.plant.plant_entity.*;

/**
 * 植物所在的一小块田地
 */
public class Tile implements Plantable {

    /**
     * Default constructor
     */
    public Tile() {
    }

    /**
     * 
     */
    public int nitrogen;

    /**
     * 
     */
    public int phosphor;

    /**
     * 
     */
    public int kalium;

    /**
     * 
     */
    public Set<BonusEffect> magicEffect;

    /**
     * 
     */
    public BasePlant plantSlot;

    /**
     * notifyObserver
     * @param type
     */
    public void addFertilizer(Fertilizer type) {
        // TODO implement here
    }

    /**
     * addObserver
     * @param plant
     */
    public void addPlant(BasePlant plant) {
        // TODO implement here
    }

    /**
     * 
     */
    public void plow() {
        // TODO implement here
    }

    

}