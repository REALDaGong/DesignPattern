package foobar.animal.action;

import foobar.animal.animal_base.Animal;
import logger.logger;
/**
 * 
 */
public class FlyWalkAction implements WalkAction {

    /**
     * Default constructor
     */
    public FlyWalkAction() {
    }

    /**
     * @return
     */
    public void walkWay(Animal animal) {
        // TODO implement here
    	logger.println("Animal "+animal.getType()+" fly");
    }

    /**
     * @return
     */
    public void runAction(Animal animal) {
    	walkWay(animal);
        // TODO implement here
    }


}