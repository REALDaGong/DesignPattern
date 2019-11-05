package foobar.animal.action;

import foobar.animal.animal_base.Animal;

/**
 * 
 */
public class FishSleepAction implements SleepAction {

    /**
     * Default constructor
     */
    public FishSleepAction() {
    }

    /**
     * @return
     */

    public void sleepWay(Animal animal) {
        // TODO implement here
    	System.out.println("Animal "+animal.getType()+" sleep in the water");
    }

    /**
     * @return
     */

    public void runAction(Animal animal) {
        // TODO implement here
    	sleepWay(animal);
    }

}