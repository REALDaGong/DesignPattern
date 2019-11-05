package foobar.tool;

import foobar.plant.consumable.effect.Anamnesis;
import foobar.plant.consumable.item.ShiF;
import foobar.plant.farm.Tile;
import foobar.plant.plant_entity.BasePlant;
import foobar.plant.plant_entity.SeedBag;
import foobar.plant.plant_profile.PlantProfileManager;
import foobar.plant.seed.CottonSeedsFactory;
import foobar.tool.agriculture_tool.WeedDecorator;
import foobar.tool.agriculture_tool.WeedTool;
import foobar.tool.building_tool.DigProxy;
import foobar.tool.building_tool.DigTool;
import foobar.tool.toolkit.ToolKit;
import foobar.tool.toolkit.command.ToolKitCommand;
import logger.logger;
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
            BasePlant basePlant = new BasePlant(PlantProfileManager.getInstance().getPlantProfile("Cotton"),"hello");
            weedDecorator.visit(basePlant);
       }
    }

    public void testPrototype(){
        WeedTool weedTool = new WeedTool();
        logger.println(weedTool.getState());
        for(int i = 1; i <= 101; i++) {
            BasePlant basePlant = new BasePlant(PlantProfileManager.getInstance().getPlantProfile("Cotton"),"hello");
            weedTool.visit(basePlant);
        }
        logger.println(weedTool.getState());
        weedTool = (WeedTool)weedTool.replaceByNewOne();
        logger.println(weedTool.getState());
    }

    public void testState(){
        WeedTool weedTool = new WeedTool();
        logger.println(weedTool.getState());
        for(int i = 1; i <= 101; i++) {
            BasePlant basePlant = new BasePlant(PlantProfileManager.getInstance().getPlantProfile("Cotton"),"hello");
            weedTool.visit(basePlant);
        }
        logger.println(weedTool.getState());
        weedTool = (WeedTool)weedTool.replaceByNewOne();
        logger.println(weedTool.getState());
    }

    public void testStrategy(){
        ToolKit tk = new ToolKit();
        tk.visit(new BasePlant(PlantProfileManager.getInstance().getPlantProfile("Cotton"),"hello"));
        tk.setMyStrategy(2);
        tk.visit(new BasePlant(PlantProfileManager.getInstance().getPlantProfile("Cotton"),"hello"));
        tk.setMyStrategy(1);
        tk.setFertilizer(new ShiF("SHit",7,"All shit",new Anamnesis()));
        CottonSeedsFactory factory=new CottonSeedsFactory();
        SeedBag seedBag=factory.produceSeeds();
        Tile tile=new Tile();
        tile.plow();
        seedBag.plantAt(tile);
        tk.setMyStrategy(1);
        tk.visit(tile);
    }

    public void testCommandMemento(){
        ToolKit tk = new ToolKit();
        ToolKitCommand tkc = new ToolKitCommand(tk);
        logger.println(tk.getLevel());
        tkc.execute();//1
        logger.println(tk.getLevel());
        tkc.redo();//2
        logger.println(tk.getLevel());
        tkc.undo();//3
        logger.println(tk.getLevel());
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
