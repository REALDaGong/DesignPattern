package foobar.animal.factory;

import foobar.animal.animal_base.Sheep;

/**
 * 
 */
public class SheepFactory extends AnimalFactory {

    /**
     * Default constructor
     */
    public SheepFactory() {
    }

    /**
     * @return
     */
    public Sheep createAnimal() {
        // TODO implement here
        return new Sheep();
    }

}