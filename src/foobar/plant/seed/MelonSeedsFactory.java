package foobar.plant.seed;

import foobar.plant.period.Seed;
import foobar.plant.plant_entity.Prefix;
import foobar.plant.plant_entity.QuailtyConstructor;
import foobar.plant.plant_entity.QuailtyDirector;
import foobar.plant.plant_entity.SeedBag;

import java.util.*;

/**
 * 
 */
public class MelonSeedsFactory extends SeedsFactory {

    //生产种子
    public SeedBag produceSeeds(){
        return new MelonSeedBag();
    }
    @Override
    //产生特殊品质的瓜
    public SeedBag produceSeedsWithSpecialQuailty(QuailtyConstructor quality) {
        QuailtyDirector qD =new QuailtyDirector();
        qD.setConstructor(quality);
        Prefix result=qD.construct();
        MelonSeedBag seedBag=new MelonSeedBag();
        seedBag.setPrefix(result);
        return seedBag;
    }
}