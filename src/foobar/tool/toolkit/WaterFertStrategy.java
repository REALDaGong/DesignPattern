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
            System.out.println("classname:"+getClass()+
                    "content:Water successfully!"+
                    "method:combinationTool");
        else System.out.println("classname:"+getClass()+
                "content:Water is full and you don't need to water!"+
                "method:combinationTool");

        //((Plantable)basePlant).addFertilizer(fertilizer);
        System.out.println("classname:"+getClass()+
                "content:Fertilization success!"+
                "method:combinationTool");
    }
}
