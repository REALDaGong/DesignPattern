package foobar.animal.animal_base;


import foobar.animal.action.FishSleepAction;
import foobar.animal.action.SwimWalkAction;
import foobar.animal.color.White;
import foobar.animal.state.FishState;

/**
 * 
 */
public class Fish extends Animal implements BreedInterface{

    /**
     * Default constructor
     */
    public Fish() {
    	super("Fish", new White(), new SwimWalkAction(), new FishSleepAction(), new FishState());
    }

    public Fish breed() {
    	state.setNStatus(1);
        System.out.println("A new fish has been born!");
    	return new Fish();
    }
    
    /**
     * 
     */
    private String type = "Fish";



}