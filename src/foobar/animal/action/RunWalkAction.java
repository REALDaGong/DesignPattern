package foobar.animal.action;

import foobar.animal.animal_base.Animal;

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
    	System.out.println("Animal "+animal.getType()+" run");
    }

    /**
     * @return
     */
    public void runAction(Animal animal) {
        // TODO implement here
    	walkWay(animal);
    }

}