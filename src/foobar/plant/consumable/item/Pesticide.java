package foobar.plant.consumable.item;

import java.util.*;

import foobar.plant.consumable.effect.*;

/**
 * 工厂产品，同时也是桥接的一方，另一方是moreEffect中的效果，可以指定多个
 */
public class Pesticide {

    /**
     * Default constructor
     */
    public Pesticide() {
    }

    /**
     * 
     */
    private Set<BonusEffect> moreEffect;

    /**
     * 
     */
    private int size;

    /**
     * 
     */
    private String brand;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private BonusEffect baseEffect;


    /**
     * @param effect
     */
    public void addEffect(BonusEffect effect) {
        // TODO implement here
    }

    /**
     * 
     */
    public void act() {
        // TODO implement here
    }

}