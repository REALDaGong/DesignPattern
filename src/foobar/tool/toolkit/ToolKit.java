package foobar.tool.toolkit;

import foobar.plant.consumable.item.Fertilizer;
import foobar.plant.plant_entity.BasePlant;
import foobar.tool.Tool;

public class ToolKit extends Tool {
    private ToolKitStrategy myStrategy;
    private Integer type;
    private Fertilizer fertilizer;

    ToolKit(){
        super();
        type = 1; // 1 代表浇水施肥，2 代表浇水除草, 默认取1
        fertilizer = null;
    }

    public void setMyStrategy(Integer type){
        this.type = type;
        if(type == 1){
            myStrategy = new WaterFertStrategy();//选择策略浇水施肥
        }else{
            myStrategy = new WaterWeedStrategy();//选择策略浇水除草
        }
    }

    @Override
    public Tool clone() {//原型模式的克隆方法
        ToolKit toolCopy = new ToolKit();
        toolCopy.setMyStrategy(type);
        return toolCopy;
    }

    @Override
    public void visit(Object basePlant) {
        if(getState() == 0){                                //组合工具已经损坏
            System.out.println("This toolkit is damaged. Need to be repaired or replaced");
            return;
        }
        myStrategy.combinationTool(basePlant);//调用具体方法

        durability -= 1;
        setState();
    }
}
