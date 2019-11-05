package foobar.product.product_factory;

import foobar.product.BaseFactory;
import foobar.product.product_interface.*;
import foobar.product.pasture_product.*;

public class PastureFactory extends BaseFactory {
    @Override
    public BaseProduct getAnimal(String animalName){
        if(animalName == null){
            return null;
        }
        if(animalName.equalsIgnoreCase("ChickenMeat")){
            return new ChickenMeat();
        } else if(animalName.equalsIgnoreCase("FishMeat")){
            return new FishMeat();
        } else if(animalName.equalsIgnoreCase("FrogMeat")){
            return new FrogMeat();
        } else if(animalName.equalsIgnoreCase("Mutton")){
            return new Mutton();
        } else if(animalName.equalsIgnoreCase("Pork")){
            return new Pork();
        } else if(animalName.equalsIgnoreCase("Egg")){
            return new Egg();
        } else if(animalName.equalsIgnoreCase("Wool")){
            return new Wool();
        }
        return null;
    }
    @Override
    public BaseProduct getPlant(String plant){
        return null;
    }
}