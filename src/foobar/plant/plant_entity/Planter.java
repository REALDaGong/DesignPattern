package foobar.plant.plant_entity;

import java.util.*;

import foobar.plant.farm.*;

/**
 * 
 */
public class Planter implements PlantingAction {

    /**
     * Default constructor
     */
    public Planter() {
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
    public Tile beforePlanting() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void afterPlanting() {
        // TODO implement here
    }

    /**
     * @param place
     */
    public void plantAt(Tile place) {
        // TODO implement here
    }

}