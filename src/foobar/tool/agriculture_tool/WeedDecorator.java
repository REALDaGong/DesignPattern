package foobar.tool.agriculture_tool;
import foobar.plant.plant_entity.BasePlant;
import foobar.tool.Tool;
import foobar.Receiver;

public class WeedDecorator extends BaseDecorator {
    private WeedTool weedTool;

    public WeedDecorator(WeedTool weedTool){
        super();
        this.weedTool = weedTool; 
    }

    public WeedDecorator(){
        super();
        this.weedTool = new WeedTool();
    }

    @Override
    public void visit(Object basePlant){

        weedTool.visit(basePlant);                  //割草刀除草

        if(getState() == 0){                        //机器已经损坏
            System.out.println("This machine is damaged. Need to be repaired or replaced");
            return;
        }

        ((BasePlant)basePlant).pullWeed();          //割草机负责后续修剪
        System.out.println("Shaved by machine successfully!");

        //operation by machine
        durability -= 2;
        setState();
    };

    @Override
    public WeedDecorator clone() {
        return new WeedDecorator();
    }
}