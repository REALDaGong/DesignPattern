package foobar.animal.action;

import foobar.animal.animal_base.Animal;
import logger.logger;
/**
 * 
 */
public class RunWalkAction implements WalkAction {

    /**
     * Default constructor
     */
    public RunWalkAction() {
    }

    /**
     * @return
     */
    public void walkWay(Animal animal) {
        // TODO implement here
    	logger.println("Animal "+animal.getType()+" run");
    }

    /**
     * @return
     */
    public void runAction(Animal animal) {
        // TODO implement here
    	walkWay(animal);
    }

}