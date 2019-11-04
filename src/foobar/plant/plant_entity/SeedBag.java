package foobar.plant.plant_entity;

import foobar.plant.farm.*;
import foobar.plant.plant_profile.*;

/**
 * 内部的prefix实现了建造者模式
 */
public abstract class SeedBag implements PlantingAction {

    protected Prefix prefix=new Prefix();

    /**
     * @param place :土地,如果是整片田就全种上了
     * @return BasePlant :被种下的植物
     */
    public BasePlant plantAt(Plantable place) {
        BasePlant basePlant=getPlant();
        place.plantSeed(basePlant);
        return basePlant;
    }

    public String getName(){
        return getProfile().getName();
    }
    public abstract BasePlantProfile getProfile();
    public void setPrefix(Prefix prefix){
        prefix=new Prefix();
    }

    private BasePlant getPlant(){
        return new BasePlant(getProfile(),prefix.All()+getProfile().getName());
    }
}