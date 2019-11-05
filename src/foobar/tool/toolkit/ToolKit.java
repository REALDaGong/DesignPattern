package foobar.tool.toolkit;
import logger.logger;
import foobar.plant.consumable.item.Fertilizer;
import foobar.plant.plant_entity.BasePlant;
import foobar.tool.Tool;
import foobar.tool.toolkit.command.Memento;
import foobar.tool.toolkit.command.MementoReceiver;

public class ToolKit extends Tool implements MementoReceiver {
    private ToolKitStrategy myStrategy;
    private Fertilizer fertilizer;
    private Integer level;//工具箱等级
    private Integer type;

    public ToolKit(){
        super();
        type = 0; // 1 代表浇水施肥，2 代表浇水除草, 默认取1
        level = 1;//初始工具箱等级为1，而后升级必须调用ToolKitCommand进行升级操作。
        fertilizer = null;
    }

    public void setFertilizer(Fertilizer fertilizer) {
        this.fertilizer = fertilizer;
    }


    public Integer getLevel() {
        return level;
    }//获取当前工具箱等级：使用场景command


    public void setMyStrategy(Integer type){//设置策略方案，调整指针指向:使用场景strategy
        this.type = type;
        if(type == 1){
            if(fertilizer==null){
                logger.println(
                        "content:Error, please set the fertilizer at first."+
                        "method:setMyStrategy");
                this.type = 0;
                return;
            }
            myStrategy = new WaterFertStrategy(fertilizer);//选择策略浇水施肥
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
    public void visit(Object basePlant) {//visit方法:使用场景visitor
        if(type == 0){
            logger.println(
                    "content:No strategy, please set."+
                    "method:visit");
            return;
        } else if (type == 1 && fertilizer == null){
            logger.println(
                    "content:Error, please set the fertilizer at first."+
                    "method:visit");
            return;
        }
        if(getState() == 0){                                //组合工具已经损坏
            logger.println(
                    "content:This toolkit is damaged. Need to be repaired or replaced"+
                    "method:visit");
            return;
        }
        myStrategy.combinationTool(basePlant);//调用具体方法

        durability -= 1;
        setState();
    }
    //添加了带有备忘录的命令升级功能，复杂调用，需要协调。
    @Override
    public Memento createMemento() {
        return new Memento(level);
    }//创建备忘录:使用场景memento

    @Override
    public void reinstallMemento(Memento memento) {
        level = memento.getToolKitLevel();
    }//恢复备忘录:使用场景memento

    @Override
    public void action() {//升级动作
        level += 1;
    }//具体的receiver工作:使用场景command

}
