package foobar.tool.building_tool;

import foobar.tool.Tool;
import logger.logger;

public class DigTool extends Tool {
    @Override
    public void visit(Object farm){
        if(getState() == 0){
            logger.println("This doe is damaged. Need to be repaired or replaced");
            return;
        }

        //int workload = (Farm)farm.setDigged();        //翻地
        //if(workload == 1)                               //1代表地刚翻了一次，0代表地不需要翻
         //   logger.println("This farmland has been digged successfully!");
        //else logger.println("This farmland does not need to be digged!");
        logger.println("This farmland has been digged by doe successfully!");


        durability -= 1;
        setState();
    };

    @Override
    public DigTool clone() {
        return new DigTool();
    }
}
