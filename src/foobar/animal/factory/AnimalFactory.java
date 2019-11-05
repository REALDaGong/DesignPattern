package foobar.animal.factory;

import foobar.animal.animal_base.Animal;

/**
 * 
 */
public abstract class AnimalFactory {

    /**
     * Default constructor
     */
    public AnimalFactory() {
    }

    /**
     * @return
     */
    public abstract Animal createAnimal();

}