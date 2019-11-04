package foobar.plant.consumable.effect;

import foobar.plant.plant_entity.BasePlant;
/**
 * 中介者模式，管理每个效果是如何被施加到植物上的
 */
public interface Mediator {

    //中介者发挥作用
    public void actAll();
}
