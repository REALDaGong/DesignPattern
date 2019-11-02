package foobar.plant.consumable.factory;

import java.util.*;

import foobar.plant.consumable.item.*;

/**
 * 
 */
public class JinKeLaFactory extends AbstractConsumableFactory {

    /**
     * Default constructor
     */
    public JinKeLaFactory() {
    }

    /**
     * @return
     */
    public Pesticide getPesticide() {
        // TODO implement here
        return new JinP();
    }

    /**
     * @return
     */
    public Fertilizer getFertilizer() {
        // TODO implement here
        return new JinF();
    }

}