package foobar.plant.farm;

import java.util.*;

import foobar.plant.consumable.item.Fertilizer;
import foobar.plant.plant_entity.BasePlant;

/**
 * 组合模式,tile 和 field基类
 */
public interface Plantable {


    /**
     * 耕地（动作）
     */
    public int plow();

    /**
     * @param type
     */
    public void addFertilizer(Fertilizer type);

    public void plantSeed(BasePlant seed);
}