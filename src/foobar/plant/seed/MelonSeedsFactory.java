package foobar.plant.seed;

import foobar.plant.plant_entity.SeedBag;

import java.util.*;

/**
 * 
 */
public class MelonSeedsFactory extends SeedsFactory {

    /**
     * Default constructor
     */
    public MelonSeedsFactory() {
    }

    /**
     * 
     */
    public String seedName;

    //生产种子
    public SeedBag produceSeeds(){
        return new MelonSeedBag();
    }

}