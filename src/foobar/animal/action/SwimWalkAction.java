package foobar.animal.action;

import foobar.animal.animal_base.Animal;
import logger.logger;
/**
 * 
 */
public class SwimWalkAction implements WalkAction {

    /**
     * Default constructor
     */
    public SwimWalkAction() {
    }

    /**
     * @return
     */
    public void walkWay(Animal animal) {
        // TODO implement here
    	logger.println("Animal "+animal.getType()+" swim in the water");
    }

    /**
     * @return
     */
    public void runAction(Animal animal) {
        // TODO implement here
    }

}