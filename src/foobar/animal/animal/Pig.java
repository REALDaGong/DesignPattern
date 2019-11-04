package foobar.animal.animal;

import foobar.animal.action.*;
import foobar.animal.color.*;
import foobar.animal.state.*;

/**
 * 
 */
public class Pig extends Animal {

    /**
     * Default constructor
     */
    public Pig() {
    	super("Pig", new Black(), new RunWalkAction(), new LyingSleepAction(), new PigState());
    }

   
    /**
     * 
     */
    private String type = "Pig";

    /**
     * 
     */
    private PigState state;
}