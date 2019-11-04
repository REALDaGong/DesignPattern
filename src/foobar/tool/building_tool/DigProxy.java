package foobar.tool.building_tool;

import foobar.building.Farm;
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
    public void visit(Object farm){
        if(digTool.getState() == 1){            //锄头可以正常工作
            digTool.visit(farm);
            return;
        }

        //启用锄地机器代理
        if(getState() == 0){                //机器已经损坏
            System.out.println("This machine is damaged. Need to be repaired or replaced");
            return;
        }

        //int workload = ((Farm)farm).setDigged();            //掘地
        //if(workload == 1)                                   //1代表地刚翻了一次，0代表地不需要翻
        //    System.out.println("This farmland has been digged successfully!");
        //else System.out.println("This farmland does not need to be digged!");
        System.out.println("This farmland has been digged by machine successfully!");


        durability -= 1;
        setState();
    };
}
