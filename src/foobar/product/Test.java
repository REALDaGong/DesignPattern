package foobar.product;

import foobar.product.product_interface.*;

public class Test {
    public boolean startalltest() {
        /**
         * 生成所有产品各一个
         * 获取所有生产出的产品的NAME
         */
        BaseFactory farmfactory = FactoryProducer.getFactory("Farm");
	    BaseFactory pasturefactory = FactoryProducer.getFactory("Pasture");
        BaseProduct animal1 = pasturefactory.getAnimal("ChickenMeat");
        BaseProduct animal2 = pasturefactory.getAnimal("FishMeat");
        BaseProduct animal3 = pasturefactory.getAnimal("FrogMeat");
        BaseProduct animal4 = pasturefactory.getAnimal("Mutton");
        BaseProduct animal5 = pasturefactory.getAnimal("Pork");
        BaseProduct animal6 = pasturefactory.getAnimal("Wool");
        BaseProduct animal7 = pasturefactory.getAnimal("Egg");
        BaseProduct plant1 = farmfactory.getPlant("AngleCotton");
        BaseProduct plant2 = farmfactory.getPlant("DemonCotton");
        BaseProduct plant3 = farmfactory.getPlant("BattleMelon");
        System.out.println(animal1.getname());
        System.out.println(animal2.getname());
        System.out.println(animal3.getname());
        System.out.println(animal4.getname());
        System.out.println(animal5.getname());
        System.out.println(animal6.getname());
        System.out.println(animal7.getname());
        System.out.println(plant1.getname());
        System.out.println(plant2.getname());
        System.out.println(plant3.getname());
        return true;
    }
}