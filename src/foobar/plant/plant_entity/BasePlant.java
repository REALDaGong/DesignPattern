package foobar.plant.plant_entity;

import java.util.*;

import foobar.plant.consumable.item.*;
import foobar.plant.farm.*;
import foobar.plant.period.*;
import foobar.plant.plant_profile.*;
import foobar.plant.product.*;

/**
 * 具体植物的基类
 */
public class BasePlant implements AddFertilizerEventObserver {

    /**
     * Default constructor
     */
    public BasePlant() {
    }

    /**
     * 
     */
    private BasePlantProfile Profile;

    /**
     * 
     */
    private Period Currentperiod;

    /**
     * 
     */
    private int CurrentHealth;

    /**
     * 
     */
    private int CurrentThirsty;
    private int currentWeed;
    /**
     * 
     */
    private String name;


    /**
     * @return
     */
    public int grow() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public Set<BaseProduct> harvest() {
        // TODO implement here
        return null;
    }

    /**
     * @param pesticideType
     */
    public void pesticided(Pesticide pesticideType) {
        // TODO implement here
    }

    /**
     * 1=success
     * 0=fail
     * @return
     */
    public int watered(int water) {
        // TODO implement here
        return 0;
    }

    /**
     * 
     */
    public void killed() {
        // TODO implement here
    }

    /**
     * 
     */
    public void FertilizerAdded() {
        // TODO implement here
    }

    public void pullWeed(){

    }
}