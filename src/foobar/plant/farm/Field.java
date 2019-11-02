package foobar.plant.farm;

import java.util.*;

import foobar.plant.consumable.effect.FPMediator;
import foobar.plant.consumable.item.*;
import foobar.plant.plant_entity.PlantState;

/**
 * 一整块田地
 */
public class Field implements Plantable {

    /**
     * Default constructor
     */
    public Field() {

    }

    /**
     * 
     */
    public ArrayList<Plantable> tiles=new ArrayList<Plantable>();


    /**
     * @param c
     */
    public void reclamation(Plantable c) {
        // TODO implement here
        tiles.add(c);
    }

    /**
     * @param c
     */
    public void abandon(Plantable c) {
        // TODO implement here
        tiles.remove(c);
    }

    /**
     * @param index 
     * @return
     */
    public Plantable getchild(int index) {
        // TODO implement here
        return tiles.get(index);
    }

    /**
     * 
     */
    public void plow() {
        // TODO implement here
        for(Plantable i:tiles){
            i.plow();
        }
    }

    /**添加使用一种药剂
     * @param type
     */
    public void addFertilizer(Fertilizer type) {
        // TODO implement here
        for(Plantable i :tiles){
            i.addFertilizer(type);
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