package foobar.animal.factory;


import foobar.animal.animal.Chicken;

/**
 * 
 */
public class ChickenFactory extends AnimalFactory {

    /**
     * Default constructor
     */
    public ChickenFactory() {
    }

    /**
     * @return
     */
    public Chicken createAnimal() {
        // TODO implement here
       return new Chicken();  
    }

}