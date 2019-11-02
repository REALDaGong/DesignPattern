package foobar.plant.farm;

import java.util.*;

import foobar.plant.consumable.effect.*;
import foobar.plant.consumable.item.*;
import foobar.plant.plant_entity.*;

/**
 * 植物所在的一小块田地
 */
public class Tile implements Plantable{

    /**
     * Default constructor
     */
    public Tile() {
    }

    /**
     * 
     */
    public int nitrogen;

    /**
     * 
     */
    public int phosphor;

    /**
     * 
     */
    public int kalium;

    /**
     * 
     */
    public Set<BonusEffect> magicEffect;

    /**
     * 
     */
    public BasePlant plantSlot;

    //地块的状态（耕没耕地
    private int plowState=0;

    // 地中种植的plant
    private ArrayList<BasePlant> myplant=new ArrayList<BasePlant>();
    /**
     * notifyObserver
     * @param type
     */
    public void addFertilizer(Fertilizer type) {
        // TODO implement here
        for(BasePlant i : myplant)
        {
            i.FertilizerAdded(type);
        }
        System.out.println(type+"has been added!");
    }

    /**
     * addObserver
     * @param plant
     */
    public void addPlant(BasePlant plant) {
        // TODO implement here
        myplant.add(plant);
        System.out.println(plant+"has been added.");
    }

    /**
     * 耕地
     */
    public void plow() {
        // TODO implement here
        plowState=1;
        System.out.println("The tile has been plowed.");
    }

    //种植种子
    public void plantSeed(SeedBag seed){
        if(plowState==0){
            System.out.println("Please plow first!");
        }
        else{
            BasePlant basePlant=new BasePlant();
            basePlant.setName(seed.getName());
            basePlant.setProfile(seed.getProfile());
        }
    }

    //调用中介者，施加所有种类药剂
    public void actAllFerPes()
    {
        FPMediator fpMediator=new FPMediator();
        fpMediator.createMediator();
        fpMediator.actAll();
    }
}