package foobar.plant.seed;

import java.util.*;

import foobar.plant.plant_entity.*;

/**
 * 
 */
public abstract class SeedsFactory {

    /**
     * Default constructor
     */
    public SeedsFactory() {
    }



    /**
     * @param quailty
     */
    public void produceSeedsWithSpecialQuailty(QuailtyConstructor quailty) {
        // TODO implement here
    }

    /**
     * 
     */
    public abstract SeedBag produceSeeds();
    /**
     * 
     */
    public void getProfile() {
        // TODO implement here
    }

}