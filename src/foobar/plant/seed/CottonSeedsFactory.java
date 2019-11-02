package foobar.plant.seed;

import foobar.plant.plant_entity.SeedBag;

import java.util.*;

/**
 * 
 */
public class CottonSeedsFactory extends SeedsFactory {

    /**
     * Default constructor
     */
    public CottonSeedsFactory(){
    }

    @Override
    public SeedBag produceSeeds() {
        return new CottonSeedBag();
    }

    /**
     * 
     */
    public String seedName;

}