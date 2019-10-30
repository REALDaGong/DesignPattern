package foobar.tool.building_tool;

import foobar.Receiver;
import foobar.tool.Tool;

public class DigProxy extends Tool {
    private DigTool digTool;

    public DigProxy(final DigTool digTool){
        super();
        this.digTool = digTool;
    }

    @Override
    public DigProxy clone() {
        return new DigProxy(digTool);
    }

    @Override
    public void visit(Object receiver){
        if(digTool.getState() == 1){
            digTool.visit(receiver);
            return;
        }

        if(getState() == 0){
            System.out.println("This machine is damaged. Need to be repaired or replaced");
            return;
        }

        System.out.println("This farmland has been turned over successfully!");
        //operation

        durability -= 1;
        setState();
    };
}
