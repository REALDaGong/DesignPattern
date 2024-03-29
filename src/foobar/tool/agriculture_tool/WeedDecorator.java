package foobar.tool.agriculture_tool;
import foobar.plant.plant_entity.BasePlant;
import foobar.tool.Tool;
import logger.logger;
public class WeedDecorator extends BaseDecorator {


    public WeedDecorator(Tool tool){
        super();
        this.tool = tool;
    }

    public WeedDecorator(){
        super();
        this.tool = new WeedTool();
    }

    @Override
    public void visit(Object basePlant){

        ((WeedTool)tool).visit(basePlant);                  //割草刀除草

        if(getState() == 0){                        //机器已经损坏
            logger.println("This machine is damaged. Need to be repaired or replaced");
            return;
        }

        ((BasePlant)basePlant).pullWeed();          //割草机负责后续修剪
        logger.println("Shaved by machine successfully!");

        //operation by machine
        durability -= 2;
        setState();
    };

    @Override
    public WeedDecorator clone() {
        return new WeedDecorator();
    }
}