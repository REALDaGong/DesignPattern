package foobar.animal.action;

import foobar.animal.animal_base.Animal;

/**
 * 
 */
public class StandingSleepAction implements SleepAction {

    /**
     * Default constructor
     */
    public StandingSleepAction() {
    }

    /**
     * @return
     */
    public void sleepWay(Animal animal) {
        // TODO implement here
    	System.out.println("Animal "+animal.getType()+" sleep by standing in the farm");
    }

    /**
     * @return
     */
    public void runAction(Animal animal) {
        // TODO implement here
    }

}