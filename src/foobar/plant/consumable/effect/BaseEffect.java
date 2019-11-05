package foobar.plant.consumable.effect;

import logger.logger;

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
    protected float Strength;

    /**
     * 药剂的关键词，没有用处，出处可见B社游戏
     */
    protected String keyword;

    /**
     * 药剂的效果
     */
    protected String description;

    /**
     * 发挥作用
     */
    @Override
    public void act() {
        logger.println(description);
    }

    /**
     * 
     */

}