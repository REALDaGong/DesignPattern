package foobar.tool.agriculture_tool;
import foobar.plant.plant_entity.BasePlant;
import foobar.tool.Tool;
import foobar.Receiver;

public class WeedTool extends Tool {

    @Override
    public void visit(Object basePlant){
        if(getState() == 0){            //割草机已经损坏
            System.out.println("This knife is damaged. Need to be repaired or replaced");
            return;
        }

        ((BasePlant)basePlant).pullWeed();          //割草机除草
        System.out.println("Successful!");

        //operation by knife
        durability -= 1;
        setState();
    };

    @Override
    public WeedTool clone() {
        return new WeedTool();
    }
}