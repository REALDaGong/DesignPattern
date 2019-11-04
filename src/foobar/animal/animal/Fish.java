package foobar.animal.animal;

import foobar.animal.action.*;
import foobar.animal.color.*;
import foobar.animal.state.*;


/**
 * 
 */
public class Fish extends Animal {

    /**
     * Default constructor
     */
    public Fish() {
    	super("Fish", new White(), new SwimWalkAction(), new FishSleepAction(), new FishState());
    }

    
    /**
     * 
     */
    private String type = "Fish";

    /**
     * 
     */
    private FishState state;

}