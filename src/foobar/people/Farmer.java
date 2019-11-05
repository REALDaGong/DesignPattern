package foobar.people;

import foobar.people.actions.ActionWrapper;
import foobar.people.actions.Provider;
import foobar.people.types.JobCategory;
import foobar.tool.Tool;
import foobar.tool.agriculture_tool.WeedTool;

// 表示农场主的类，继承自 Person
// 运用单例模式，将 Farmer 设计为单例类，保证在一个 JVM 中只有一个实例存在
public class Farmer extends Person {
    // 将所有农场工人放在一个链表中，firstFarmhand 和 lastFarmhand 分别表示该链表的首尾元素
    // 农场工人链表同时也构成了责任链模式中的一条责任链
    private Farmhand firstFarmhand = null;
    private Farmhand lastFarmhand = null;

    // 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
    private static Farmer farmer = null;

    // 私有构造方法，防止被实例化
    private Farmer(String name) {
        super(name);
        System.out.println("Farmer " + super.name + " is successfully created!");
    }

    // 静态工程方法，创建实例
    public static Farmer getFarmer(String name) {
        if (farmer == null) {
            farmer = new Farmer(name);
        }
        return farmer;
    }

    // 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
    public Object readResolve() {
        return farmer;
    }

    // 雇佣农场工人，即向农场工人链表的尾部添加新元素
    public Farmhand employFarmhand(String name, int salary, JobCategory jobCategory) {
        Farmhand farmhand = new Farmhand(name, salary, jobCategory);
        if (firstFarmhand == null) {
            firstFarmhand = farmhand;
            lastFarmhand = farmhand;
        }
        else {
            lastFarmhand.setNext(farmhand);
            lastFarmhand = farmhand;
        }

        return farmhand;
    }

    // 将工作发给农场工人责任链
    public boolean releaseAgricultureWork(Tool tool, Object obj) {
        return firstFarmhand.doAgricultureWork(tool, obj);
    }
    public boolean releaseBuildingWork(Tool tool, Object obj) {
        return firstFarmhand.doBuildingWork(tool, obj);
    }
    public boolean releaseRepairWork(Tool tool) {
        return firstFarmhand.repairTool(tool);
    }
    public boolean releaseReplaceWork(Tool tool) {
        return firstFarmhand.replaceTool(tool);
    }
    public void replaceWeedTool(Tool tool){
        tool = (WeedTool)tool.replaceByNewOne();
    }
}