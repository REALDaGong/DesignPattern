package foobar.plant.plant_profile;

import java.util.*;

import foobar.plant.period.*;
import foobar.plant.product.drop_list.*;

/**
 * 一种植物的基本属性的基类
 */
public class BasePlantProfile {

    /**
     * Default constructor
     */
    public BasePlantProfile() {
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Period firstPeriod;

    /**
     * 
     */
    private int thirsty;

    /**
     * 
     */
    private int health;

    /**
     * 
     */
    private ProductDropList product;

    /**
     * 
     */
    private Set<Integer> availableTile;


    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public int getCurrentPeriod() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getThirsty() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getHealth() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getProduct() {
        // TODO implement here
        return 0;
    }

    /**
     * @param id 
     * @return
     */
    public boolean IsAvailableAt(int id) {
        // TODO implement here
        return false;
    }

    /**
     * @param list
     */
    public void addDropList(ProductDropList list) {
        // TODO implement here
    }

}