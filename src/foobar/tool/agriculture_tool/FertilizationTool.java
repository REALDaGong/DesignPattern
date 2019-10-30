package foobar.tool.agriculture_tool;
import foobar.plant.consumable.item.Fertilizer;
import foobar.plant.farm.Plantable;
import foobar.plant.plant_entity.BasePlant;
import foobar.tool.Tool;
import foobar.Receiver;

import javax.lang.model.type.NullType;

public class FertilizationTool extends Tool {

    private Fertilizer fertilizer;

    public FertilizationTool(){
        fertilizer = null;
    }

    @Override
    public void visit(Object basePlant){
        if(getState() == 0){
            System.out.println("This fertilization tool is damaged. Need to be repaired or replaced");
            return;
        }

        //operation
        ((Plantable)basePlant).addFertilizer(fertilizer);

        //operation

        System.out.println("Successful!");

        durability -= 1;
        setState();
    }


    @Override
    public FertilizationTool  clone() {
        return new FertilizationTool();
    }
}
