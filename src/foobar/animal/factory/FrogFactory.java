package foobar.animal.factory;

import foobar.animal.animal.Frog;

/**
 * 
 */
public class FrogFactory extends AnimalFactory {

    /**
     * Default constructor
     */
    public FrogFactory() {
    }

    /**
     * @return
     */
    public Frog createAnimal() {
        // TODO implement here
        return new Frog();
    }

}