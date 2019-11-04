package foobar.tool;

import foobar.plant.plant_entity.BasePlant;
import foobar.tool.agriculture_tool.WeedDecorator;
import foobar.tool.agriculture_tool.WeedTool;
import foobar.tool.building_tool.DigProxy;
import foobar.tool.building_tool.DigTool;
import foobar.tool.toolkit.ToolKit;
import foobar.tool.toolkit.command.ToolKitCommand;

//测试tool中的设计模式
public class Test {
    public void testProxy(){
        DigTool digTool = new DigTool();
        DigProxy digProxy = new DigProxy(digTool);
        for(int i = 1; i <= 102; i++) {
            Object obj = new Object();
            digProxy.visit(obj);
        }
    }

    public void testDecorator(){
        WeedTool weedTool = new WeedTool();
        WeedDecorator weedDecorator = new WeedDecorator(weedTool);
        for(int i = 1; i <= 51; i++) {
            BasePlant basePlant = new BasePlant();
            weedDecorator.visit(basePlant);
       }
    }

    public void testPrototype(){
        WeedTool weedTool = new WeedTool();
        System.out.println(weedTool.getState());
        for(int i = 1; i <= 101; i++) {
            BasePlant basePlant = new BasePlant();
            weedTool.visit(basePlant);
        }
        System.out.println(weedTool.getState());
        weedTool = (WeedTool)weedTool.replaceByNewOne();
        System.out.println(weedTool.getState());
    }

    public void testState(){
        WeedTool weedTool = new WeedTool();
        System.out.println(weedTool.getState());
        for(int i = 1; i <= 101; i++) {
            BasePlant basePlant = new BasePlant();
            weedTool.visit(basePlant);
        }
        System.out.println(weedTool.getState());
        weedTool = (WeedTool)weedTool.replaceByNewOne();
        System.out.println(weedTool.getState());
    }

    public void testStrategy(){
        ToolKit tk = new ToolKit();
        tk.visit(new BasePlant());
        tk.setMyStrategy(2);
        tk.visit(new BasePlant());
        tk.setMyStrategy(1);
        tk.visit(new BasePlant());
    }

    public void testCommandMemento(){
        ToolKit tk = new ToolKit();
        ToolKitCommand tkc = new ToolKitCommand(tk);
        System.out.println(tk.getLevel());
        tkc.execute();//1
        System.out.println(tk.getLevel());
        tkc.redo();//2
        System.out.println(tk.getLevel());
        tkc.undo();//3
        System.out.println(tk.getLevel());
    }

    public void startAllTest(){
        testPrototype();
        testProxy();
        testDecorator();
        testState();

        testStrategy();
        testCommandMemento();
    }

}
