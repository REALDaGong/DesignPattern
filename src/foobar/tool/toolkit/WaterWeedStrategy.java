package foobar.tool.toolkit;

import foobar.plant.plant_entity.BasePlant;

public class WaterWeedStrategy implements ToolKitStrategy {
    @Override
    public void combinationTool(Object basePlant) {
        int watered = ((BasePlant)basePlant).watered(20);
        if(watered == 1)                                    //执行浇水前植物缺水则返回1，否则返回0
            System.out.println("classname:"+getClass()+
                    "content:Water successfully!"+
                    "method:combinationTool");
        else System.out.println("classname:"+getClass()+
                "content:Water is full and you don't need to water!"+
                "method:combinationTool");

        ((BasePlant)basePlant).pullWeed();
        System.out.println("classname:"+getClass()+
                "content:Weeding success!"+
                "method:combinationTool");
    }
}
