package foobar.tool.agriculture_tool;
import foobar.plant.plant_entity.BasePlant;
import foobar.tool.Tool;
import logger.logger;
public class WeedTool extends Tool {

    @Override
    public void visit(Object basePlant){
        if(getState() == 0){            //割草刀已经损坏
            logger.println("This knife is damaged. Need to be repaired or replaced");
            return;
        }

        ((BasePlant)basePlant).pullWeed();          //割草刀除草
        logger.println("Weeded by knife successfully!");

        //operation by knife
        durability -= 1;
        setState();
    };

    @Override
    public WeedTool clone() {
        return new WeedTool();
    }
}