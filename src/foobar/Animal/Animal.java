package foobar.Animal;

import foobar.Animal.AnimalAction.*;
import foobar.Animal.AnimalState.*;
import foobar.Animal.Color.Color;

import java.util.*;

/**
 * 
 */
public class Animal {

    /**
     * Default constructor
     */
    public Animal() {
    }

    /**
     * 
     */
    private boolean isAlive = true;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private WalkAction walkAction;

    /**
     * 
     */
    private SleepAction sleepAction;

    /**
     * 
     */
    private Color color;

    /**
     * 
     */
    private AnimalState state;

    /**
     * @return
     */
    public boolean getLife() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public boolean getHungry() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public String getType() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public void sleep() {
        // TODO implement here

    }

    /**
     * @return
     */
    public void walk() {
        // TODO implement here

    }

    /**
     * @return
     */
    public String getColor() {
        // TODO implement here
        return "";
    }

    /**
     * @param color 
     * @return
     */
    public void setColor(Color color) {
        // TODO implement here

    }

    /**
     * @return
     */
    public void eat() {
        // TODO implement here

    }

    /**
     * @return
     */
    public void setHungry() {
        // TODO implement here

    }

    /**
     * @return
     */
    public void produceWithoutDeath() {
        // TODO implement here

    }

    /**
     * @return
     */
    public void produceWithDeath() {
        // TODO implement here

    }

}