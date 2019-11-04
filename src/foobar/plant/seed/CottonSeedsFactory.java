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
    //产生一个玉米种子
    public SeedBag produceSeeds() {
        return new CottonSeedBag();
    }

    //产生一个特殊品质的玉米
    public SeedBag produceSeedsWithSpecialQuailty(QuailtyConstructor quality) {
        QuailtyDirector qD =new QuailtyDirector();
        qD.setConstructor(quality);
        Prefix result=qD.construct();
        CottonSeedBag seedBag=new CottonSeedBag();
        seedBag.setPrefix(result);
        return seedBag;
    }

}