package foobar.tool.toolkit;

import foobar.plant.consumable.item.Fertilizer;
import foobar.plant.farm.Plantable;
import foobar.plant.plant_entity.BasePlant;

public class WaterFertStrategy implements ToolKitStrategy {
    private Fertilizer fertilizer;

    WaterFertStrategy(){
        fertilizer = null;
    }
    public void combinationTool(Object basePlant) {
        int watered = ((BasePlant)basePlant).watered(20);
        if(watered == 1)                                    //执行浇水前植物缺水则返回1，否则返回0
            System.out.println("Water successfully!");
        else System.out.println("Water is full and you don't need to water!");

        ((Plantable)basePlant).addFertilizer(fertilizer);

        System.out.println("Fertilization success!");
    }
}
