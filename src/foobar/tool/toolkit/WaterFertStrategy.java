package foobar.tool.toolkit;
import logger.logger;
import foobar.plant.consumable.item.Fertilizer;
import foobar.plant.farm.Plantable;
import foobar.plant.farm.Tile;
import foobar.plant.plant_entity.BasePlant;

public class WaterFertStrategy implements ToolKitStrategy {
    private Fertilizer fertilizer;

    WaterFertStrategy(Fertilizer fertilizer){
        this.fertilizer = fertilizer;
    }
    public void combinationTool(Object tile) {
        BasePlant plant = ((Tile)tile).getPlant();
        int watered = plant.watered(20);
        if(watered == 1)                                    //执行浇水前植物缺水则返回1，否则返回0
            logger.println(
                    "content:Water successfully!"+
                    "method:combinationTool");
        else logger.println(
                "content:Water is full and you don't need to water!"+
                "method:combinationTool");
        ((Tile) tile).addFertilizer(fertilizer);
        logger.println(
                "content:Fertilization success!"+
                "method:combinationTool");
    }
}
