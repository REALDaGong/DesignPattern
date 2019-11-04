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

    //获取种子名称
    public String getName(){
        return getProfile().getName();
    }

    //获取种子的属性
    public abstract BasePlantProfile getProfile();

    //设置种子的品质
    public void setPrefix(Prefix prefix){
        prefix=new Prefix();
    }

    //获取种子对应的植物
    private BasePlant getPlant(){
        return new BasePlant(getProfile(),prefix.All()+getProfile().getName());
    }
}