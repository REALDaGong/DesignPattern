package foobar.animal.animal;

import foobar.animal.action.*;
import foobar.animal.color.*;
import foobar.animal.state.*;

/**
 * 
 */
public class Sheep extends Animal {

    /**
     * Default constructor
     */
    public Sheep() {
    	super("Sheep", new White(), new RunWalkAction(), new LyingSleepAction(), new SheepState());
    }

   
    /**
     * 
     */
    private String type = "Sheep";

    /**
     * 
     */
    private SheepState state;

}