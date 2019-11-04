package foobar.animal.animal;


import foobar.animal.action.*;
import foobar.animal.color.*;
import foobar.animal.state.*;

/**
 * 
 */
public class Chicken extends Animal {

    /**
     * Default constructor
     */
    public Chicken() {
    	super("Chicken", new White(), new RunWalkAction(), new LyingSleepAction(), new ChickenState());
    }

    
    /**
     * 
     */
    private String type = "Chicken";

    /**
     * 
     */
    private ChickenState state;

    /**
     * 
     */
    public void Chicken() {
        // TODO implement here
    }

}