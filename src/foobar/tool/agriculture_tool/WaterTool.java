package foobar.tool.agriculture_tool;
import foobar.plant.plant_entity.BasePlant;
import foobar.tool.Tool;

public class WaterTool extends Tool {
    public WaterTool(){
        super();
    }


    @Override
    public void visit(Object basePlant){
        if(getState() == 0){                                //水壶已经损坏
            System.out.println("This water tool is damaged. Need to be repaired or replaced");
            return;
        }

        int watered = ((BasePlant)basePlant).watered(20);      //浇水
        if(watered == 1)                                    //执行浇水前植物缺水则返回1，否则返回0
            System.out.println("Successful!");
        else System.out.println("Water is full and you don't need to water!");

        durability -= 1;
        setState();
    }

    @Override
    public WaterTool clone() {
        return new WaterTool();
    }
}