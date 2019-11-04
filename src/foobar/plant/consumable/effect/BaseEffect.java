package foobar.plant.consumable.effect;

import java.util.*;

/**
 *  用作桥接模式
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
     * 药剂的关键词，没有用处，出处可见B社游戏
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
        System.out.println(description);
    }

    /**
     * 
     */

}