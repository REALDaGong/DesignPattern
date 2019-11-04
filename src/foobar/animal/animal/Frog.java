package foobar.animal.animal;

import foobar.animal.action.*;
import foobar.animal.color.*;
import foobar.animal.state.*;

/**
 * 
 */
public class Frog extends Animal {

    /**
     * Default constructor
     */
    public Frog() {
    	super("Frog", new Green(), new RunWalkAction(), new StandingSleepAction(), new FrogState());
    }

    
    /**
     * 
     */
    private String type = "Frog";

    /**
     * 
     */
    private FrogState state;

    /**
     * @return
     */
    public void deinsectization() {
        // TODO implement here
    }

}