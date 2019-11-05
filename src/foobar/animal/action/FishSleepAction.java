package foobar.animal.action;

import foobar.animal.animal_base.Animal;
import logger.logger;
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
    	logger.println("Animal "+animal.getType()+" sleep in the water");
    }

    /**
     * @return
     */

    public void runAction(Animal animal) {
        // TODO implement here
    	sleepWay(animal);
    }

}