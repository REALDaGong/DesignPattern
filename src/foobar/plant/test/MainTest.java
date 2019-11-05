package foobar.plant.test;

import foobar.plant.consumable.effect.AddN;
import foobar.plant.consumable.effect.Anamnesis;
import foobar.plant.consumable.factory.*;
import foobar.plant.consumable.item.*;
import foobar.plant.farm.*;
import foobar.plant.plant_entity.BasePlant;
import foobar.plant.plant_entity.Planter;
import foobar.plant.plant_entity.SeedBag;
import foobar.plant.plant_profile.*;
import foobar.plant.seed.CottonSeedsFactory;
import foobar.plant.seed.MelonSeedsFactory;
import foobar.product.drop_list.*;
import foobar.product.product_interface.BaseProduct;

import java.util.ArrayList;

public class MainTest {
    public static void Main(){
        System.out.println("plant测试开始......");
        String packName=new MainTest().getClass().getPackage().getName();
        //测试单例，享元
        BasePlantProfile pro1=PlantProfileManager.getInstance().getPlantProfile("Cotton");

        assert (pro1!=null):"测试1来自:"+packName+":无法通过反射获取Profile";

        PlantProfileManager.getInstance().addPlantProfile("豌豆射手",100,100,new ProductDropList());
        BasePlantProfile pro2=PlantProfileManager.getInstance().getPlantProfile("豌豆射手");

        assert (pro2!=null):"测试1来自:"+packName+":无法获取动态建立的Profile";

        BasePlantProfile pro3=PlantProfileManager.getInstance().getPlantProfile("豌豆射手");

        assert (pro3==pro2):"测试1来自:"+packName+":获取的不是同一个实例";

        //测试地块，组合模式

        Plantable field=new Field();
        Plantable tile=new Tile();

        //观察无可犁地时的行为
        field.plow();

        ((Field)field).reclamation(tile);

        assert (((Field)field).getchild(0)==tile):"测试2来自"+packName+":加入地块失败";

        //加入大量地块
        for(int i=0; i<20; i++){
            ((Field)field).reclamation(new Tile());
        }

        field.plow();

        //创建可用的seedBag

        CottonSeedsFactory factory=new CottonSeedsFactory();
        SeedBag seedBag=factory.produceSeeds();
        seedBag.plantAt((Tile) ((Field) field).getchild(0));


        //测试化肥农药的创建，包含执行逻辑

        JinKeLaFactory Jfactory=new JinKeLaFactory();

        Fertilizer f=Jfactory.getFertilizer();
        Pesticide p=Jfactory.getPesticide();

        ((Tile) ((Field)field).getchild(0)).getPlant().pesticided(p);

        //测试普通农药
        f.setBonusEffect(new Anamnesis());
        field.addFertilizer(f);

        //测试桥接模式，加强农药
        f.addEffect(new AddN());
        field.addFertilizer(f);

        //测试收获
        ((Tile) ((Field) field).getchild(0)).plantSlot.grow();
        ArrayList<BaseProduct> product1=((Tile) ((Field) field).getchild(0)).plantSlot.harvest();

        //测试代理模式
        Plantable field2=new Field();
        Plantable tile2=new Tile();

        ((Field)field2).reclamation(tile2);

        assert (((Field)field2).getchild(0)==tile2):"测试3来自"+packName+":加入地块失败";

        MelonSeedsFactory factory2=new MelonSeedsFactory();
        SeedBag seedBag2=factory2.produceSeeds();
        seedBag.plantAt((Tile) ((Field) field2).getchild(0));
        Planter planter=new Planter(seedBag2, (Tile) ((Field) field2).getchild(0));
        planter.plantAt(tile2);



    }
}
