package foobar.plant.plant_entity;

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
    private String name;

    /**
     * 
     */
    private int quailtyControl;


    /**
     * @param place
     */
    public void plantAt(Tile place) {
        // TODO implement here
        place.plantSeed(this);
    }

    public String getName(){
        return seed.getName();
    }

    public  void setName(String name){
        this.name=name;
    }

    public void setSeed(){
        if(PlantProfileManager.getInstance().getPlantProfileWithName(name)!=null){
            seed=PlantProfileManager.getInstance().getPlantProfileWithName(name);
        }
        else{
            seed=PlantProfileManager.getInstance().generatePlantProfile(name);
        }
    }

    public BasePlantProfile getProfile(){
        return seed;
    }
}