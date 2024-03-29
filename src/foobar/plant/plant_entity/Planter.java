package foobar.plant.plant_entity;

import foobar.plant.farm.*;
import logger.logger;

/**
 * 代理模式,tile可以直接被种，但是需要犁地，这个可以帮你犁，耶
 */
public class Planter implements PlantingAction {

    /**
     * Default constructor
     */
    public Planter(SeedBag fillWith,Tile plantAt) {
        seeds=fillWith;
        goodtile=plantAt;
    }

    /**
     * 
     */
    public SeedBag seeds;

    /**
     * 
     */
    public Tile goodtile;

    /**
     * @return
     */
    private Tile beforePlanting() {
        logger.println("before planting..");
        goodtile.plow();
        return null;
    }

    /**
     * 
     */
    private void afterPlanting() {
        logger.println("after planting..");
    }

    /**自动种植
     * @return
     */
    public BasePlant plantAt(Plantable place) {
        beforePlanting();
        BasePlant plant=seeds.plantAt(goodtile);
        afterPlanting();
        return plant;
    }

}