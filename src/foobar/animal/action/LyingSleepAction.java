package foobar.animal.action;

import foobar.animal.animal_base.Animal;
import logger.logger;
/**
 * 
 */
public class LyingSleepAction implements SleepAction {

    /**
     * Default constructor
     */
    public LyingSleepAction() {
    }

    /**
     * @return
     */
    public void sleepWay(Animal animal) {
        // TODO implement here
    	logger.println("Animal "+animal.getType()+" sleep by lying in the farm ");
    }

    /**
     * @return
     */
    public void runAction(Animal animal) {
        // TODO implement here
    	sleepWay(animal);
    }

}