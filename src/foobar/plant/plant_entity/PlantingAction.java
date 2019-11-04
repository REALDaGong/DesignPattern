package foobar.plant.plant_entity;

import foobar.plant.farm.*;

/**
 * 这里是代理模式
 */
public interface PlantingAction {

    /**
     * @return
     */
    public BasePlant plantAt(Plantable place);

}