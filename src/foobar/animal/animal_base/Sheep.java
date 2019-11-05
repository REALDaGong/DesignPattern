package foobar.animal.animal_base;


import foobar.animal.action.LyingSleepAction;
import foobar.animal.action.RunWalkAction;
import foobar.animal.color.White;
import foobar.animal.state.SheepState;

/**
 * 
 */
public class Sheep extends Animal implements BreedInterface{

    /**
     * Default constructor
     */
    public Sheep() {
    	super("Sheep", new White(), new RunWalkAction(), new LyingSleepAction(), new SheepState());
    }

    public Sheep breed() {
    	this.state.setNStatus(1);
        System.out.println("A new sheep has been born!");
    	return new Sheep();
    }
   
    /**
     * 
     */
    private String type = "Sheep";


}