package foobar.plant.consumable.factory;

import java.util.*;

import foobar.plant.consumable.effect.BaseEffect;
import foobar.plant.consumable.item.*;

public class ShiDanLiFactory extends AbstractConsumableFactory {

    /**
     * Default constructor
     */
    private String brand="SDL";
    private int size=1;
    private String description="best SDL for everyone";
    private BaseEffect effect=new BaseEffect();

    public ShiDanLiFactory() {
    }
    public Pesticide getPesticide() {

        return new ShiP(brand,size,description,effect);
    }
    public Fertilizer getFertilizer() {

        return new ShiF(brand,size,description,effect);
    }

}