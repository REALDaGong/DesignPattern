package foobar.animal.animal_base;


import foobar.animal.action.LyingSleepAction;
import foobar.animal.action.RunWalkAction;
import foobar.animal.color.White;
import foobar.animal.state.ChickenState;
/**
 * 
 */
public class Chicken extends Animal implements BreedInterface{

    /**
     * Default constructor
     */
    public Chicken() {
    	super("Chicken", new White(), new RunWalkAction(), new LyingSleepAction(), new ChickenState());
    }

    public Chicken breed() {

    	state.setNStatus(1);
    	System.out.println("A new chicken has been born!");
    	return new Chicken();
    	
    }
    
    /**
     * 
     */
    private String type = "Chicken";


    /**
     * 
     */
    public void Chicken() {
        // TODO implement here
    }

}