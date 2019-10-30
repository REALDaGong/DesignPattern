package foobar.plant.farm;

import java.util.*;

import foobar.plant.consumable.item.*;

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
    public Set<Tile> tiles;


    /**
     * @param c
     */
    public void reclamation(Plantable c) {
        // TODO implement here
    }

    /**
     * @param c
     */
    public void abandon(Plantable c) {
        // TODO implement here
    }

    /**
     * @param index 
     * @return
     */
    public Plantable getchild(int index) {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void plow() {
        // TODO implement here
    }

    /**
     * @param type
     */
    public void addFertilizer(Fertilizer type) {
        // TODO implement here
    }
}