package foobar.tool.toolkit;

import foobar.plant.plant_entity.BasePlant;

public class WaterWeedStrategy implements ToolKitStrategy {
    @Override
    public void combinationTool(Object basePlant) {
        int watered = ((BasePlant)basePlant).watered(20);
        if(watered == 1)                                    //执行浇水前植物缺水则返回1，否则返回0
            System.out.println("Water successfully!");
        else System.out.println("Water is full and you don't need to water!");

        ((BasePlant)basePlant).pullWeed();
        System.out.println("Weeding success!");
    }
}
