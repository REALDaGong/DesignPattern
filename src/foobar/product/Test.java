package foobar.product;

import foobar.product.product_interface.*;
import logger.logger;
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
        logger.println(animal1.getname());
        logger.println(animal2.getname());
        logger.println(animal3.getname());
        logger.println(animal4.getname());
        logger.println(animal5.getname());
        logger.println(animal6.getname());
        logger.println(animal7.getname());
        logger.println(plant1.getname());
        logger.println(plant2.getname());
        logger.println(plant3.getname());
        return true;
    }
}