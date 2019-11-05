package foobar.animal.animal_base;


import foobar.animal.action.RunWalkAction;
import foobar.animal.action.StandingSleepAction;
import foobar.animal.color.Green;
import foobar.animal.state.FrogState;

/**
 * 
 */
public class Frog extends Animal implements BreedInterface{
    /**
     * Default constructor
     */
    public Frog() {
    	super("Frog", new Green(), new RunWalkAction(), new StandingSleepAction(), new FrogState());
    }

    public Frog breed() {
    	this.state.setNStatus(1);    
    	return new Frog();
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