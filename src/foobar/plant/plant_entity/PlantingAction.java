package foobar.plant.plant_entity;

import java.util.*;

import foobar.plant.farm.*;

/**
 * 这里是代理模式
 */
public interface PlantingAction {

    /**
     * @param place
     */
    public void plantAt(Tile place);

}