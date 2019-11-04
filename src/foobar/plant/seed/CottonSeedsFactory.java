package foobar.plant.seed;

import foobar.plant.plant_entity.Prefix;
import foobar.plant.plant_entity.QuailtyConstructor;
import foobar.plant.plant_entity.QuailtyDirector;
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
    public SeedBag produceSeedsWithSpecialQuailty(QuailtyConstructor quality) {
        QuailtyDirector qD =new QuailtyDirector();
        qD.setConstructor(quality);
        Prefix result=qD.construct();
        CottonSeedBag seedBag=new CottonSeedBag();
        seedBag.setPrefix(result);
        return seedBag;
    }

}