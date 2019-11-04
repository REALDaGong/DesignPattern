package foobar.plant.consumable.factory;

import java.util.*;

import foobar.plant.consumable.effect.BaseEffect;
import foobar.plant.consumable.item.*;
public class JinKeLaFactory extends AbstractConsumableFactory {

    /**
     * Default constructor
     */
    private String brand="JKL";
    private int size=1;
    private String description="best JKL for everyone";
    private BaseEffect effect=new BaseEffect();

    public JinKeLaFactory() {

    }
    /**初始化一个农药，返回它
     * @return 农药对象
     */
    public Pesticide getPesticide() {

        return new JinP(brand,size,description,effect);
    }

    /**初始化一个化肥，返回它
     * @return 化肥对象
     */
    public Fertilizer getFertilizer() {

        return new JinF(brand,size,description,effect);
    }

}