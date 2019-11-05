package foobar.people;

import foobar.people.mementoes.SalaryStorage;
import foobar.people.types.JobCategory;
import foobar.plant.consumable.effect.Anamnesis;
import foobar.plant.consumable.item.ShiF;
import foobar.plant.farm.Tile;
import foobar.plant.plant_entity.BasePlant;
import foobar.plant.plant_entity.SeedBag;
import foobar.plant.plant_profile.PlantProfileManager;
import foobar.plant.seed.CottonSeedsFactory;
import foobar.tool.agriculture_tool.WeedTool;
import foobar.tool.toolkit.ToolKit;

public class Test {
    public void startAllTest(){
        Farmer farmer = Farmer.getFarmer("Farmer");  // 单例模式
        Farmhand tom = farmer.employFarmhand("Tom", 1000, JobCategory.AGRICULTURE);
        farmer.employFarmhand("Sam", 2000, JobCategory.BUILDING);
        farmer.employFarmhand("Henry", 3000, JobCategory.MAINTENANCE);

        WeedTool tool = new WeedTool();
        BasePlant obj = new BasePlant(PlantProfileManager.getInstance().getPlantProfile("Cotton"),"hello");
        //Object obj = new Object();

        farmer.replaceWeedTool(tool);

        ToolKit tk = new ToolKit();
        tk.setFertilizer(new ShiF("SHit",7,"All shit",new Anamnesis()));
        CottonSeedsFactory factory=new CottonSeedsFactory();
        SeedBag seedBag=factory.produceSeeds();
        Tile tile=new Tile();
        tile.plow();
        seedBag.plantAt(tile);
        tk.setMyStrategy(1);

        farmer.releaseAgricultureWork(tk, tile);
        farmer.releaseAgricultureWork(tool, obj);
        // farmer.releaseBuildingWork(tool, obj);
        // farmer.releaseRepairWork(tool);
        // farmer.releaseReplaceWork(tool);

        // 备忘录模式
        SalaryStorage salaryStorage = new SalaryStorage(tom.createSalaryMemento());
        System.out.println(tom.getName() + "'s original salary is $" + tom.getSalary() + '.');
        // 修改薪水值
        tom.setSalary(5000);
        System.out.println(tom.getName() + "'s salary is $" + tom.getSalary() + " after revision.");
        // 恢复薪水值
        tom.restoreFromSalaryMemento((salaryStorage.getSalaryMemento()));
        System.out.println(tom.getName() + "'s salary is $" + tom.getSalary() + " after restoration.");
    }
}
