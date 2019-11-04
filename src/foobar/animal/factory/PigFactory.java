package foobar.animal.factory;


import foobar.animal.animal.Pig;

/**
 * 
 */
public class PigFactory extends AnimalFactory {

    /**
     * Default constructor
     */
    public PigFactory() {
    }

    /**
     * @return
     */
    public Pig createAnimal() {
        // TODO implement here
        return new Pig();
    }

}