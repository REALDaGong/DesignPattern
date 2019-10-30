package foobar.tool.building_tool;

import foobar.Receiver;
import foobar.tool.Tool;

public class DigTool extends Tool {
    @Override
    public void visit(Object receiver){
        if(getState() == 0){
            System.out.println("This doe is damaged. Need to be repaired or replaced");
            return;
        }

        //operation
        System.out.println("This farmland has been turned over successfully!");

        durability -= 1;
        setState();
    };

    @Override
    public DigTool clone() {
        return new DigTool();
    }
}
