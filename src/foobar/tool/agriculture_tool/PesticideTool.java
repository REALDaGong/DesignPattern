package foobar.tool.agriculture_tool;

import foobar.Receiver;
import foobar.plant.consumable.item.Pesticide;
import foobar.plant.plant_entity.BasePlant;
import foobar.tool.Tool;

public class PesticideTool extends Tool {
    private Pesticide pesticide;                //农药

    public PesticideTool(){
        super();
        pesticide = null;
    }

    @Override
    public void visit(Object basePlant){
        if(getState() == 0){                    //该农药喷射器已经损坏
            System.out.println("This pesticide tool is damaged. Need to be repaired or replaced");
            return;
        }

        ((BasePlant)basePlant).pesticided(this.pesticide);
        System.out.println("Successful!");
        //operation

        durability -= 1;
        setState();
    }

    @Override
    public PesticideTool  clone() {
        return new PesticideTool();
    }



}
