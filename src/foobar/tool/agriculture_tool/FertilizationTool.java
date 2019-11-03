package foobar.tool.agriculture_tool;
import foobar.plant.consumable.item.Fertilizer;
import foobar.plant.farm.Plantable;
import foobar.plant.plant_entity.BasePlant;
import foobar.tool.Tool;
import foobar.Receiver;

import javax.lang.model.type.NullType;

//喷肥料壶
public class FertilizationTool extends Tool {

    private Fertilizer fertilizer;          //农药

    public FertilizationTool(){
        super();
        fertilizer = null;
    }

    @Override
    public void visit(Object basePlant){
        if(getState() == 0){                //肥料壶已经损坏
            System.out.println("This fertilization tool is damaged. Need to be repaired or replaced");
            return;
        }

        ((Plantable)basePlant).addFertilizer(fertilizer);       //选择肥料

        //operation

        System.out.println("Successful!");

        durability -= 2;
        setState();
    }


    @Override
    public FertilizationTool  clone() {
        return new FertilizationTool();
    }
}
