package foobar.animal.factory;

import foobar.animal.animal_base.Fish;

/**
 * 
 */
public class FishFactory extends AnimalFactory {

    /**
     * Default constructor
     */
    public FishFactory() {
    }

    /**
     * @return
     */
    public Fish createAnimal() {
        // TODO implement here
        return new Fish();
    }

}