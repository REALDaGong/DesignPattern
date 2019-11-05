package foobar.animal.animal_base;


import foobar.animal.action.LyingSleepAction;
import foobar.animal.action.RunWalkAction;
import foobar.animal.color.Black;
import foobar.animal.state.PigState;
/**
 * 
 */
public class Pig extends Animal implements BreedInterface{

    /**
     * Default constructor
     */
    public Pig() {
    	super("Pig", new Black(), new RunWalkAction(), new LyingSleepAction(), new PigState());
    }

    public Pig breed() {
    	this.state.setNStatus(1);    
    	return new Pig();
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