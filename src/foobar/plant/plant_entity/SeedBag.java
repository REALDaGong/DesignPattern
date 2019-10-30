package foobar.plant.plant_entity;

import java.util.*;

import foobar.plant.farm.*;
import foobar.plant.plant_profile.*;

/**
 * 建造者模式
 */
public class SeedBag implements PlantingAction {

    /**
     * Default constructor
     */
    public SeedBag() {
    }

    /**
     * 
     */
    private BasePlantProfile seed;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private int quailtyControl;


    /**
     * @param place
     */
    public void plantAt(Tile place) {
        // TODO implement here
    }

}