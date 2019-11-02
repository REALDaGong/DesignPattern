package foobar.plant.consumable.effect;

import java.util.*;

/**
 * 
 */
public class BaseEffect implements BonusEffect {

    /**
     * Default constructor
     */
    public BaseEffect() {
    }

    /**
     * 药剂的强度
     */
    public float Strength;

    /**
     * 
     */
    public String keyword;

    /**
     * 药剂的效果
     */
    public String description;

    /**
     * 发挥作用
     */
    @Override
    public void act() {
        // TODO implement here
        System.out.println(description);
    }

    /**
     * 
     */

}