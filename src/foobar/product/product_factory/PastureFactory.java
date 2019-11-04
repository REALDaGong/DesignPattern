package foobar.product.product_factory;

import foobar.product.BaseFactory;
import foobar.product.product_interface.*;
import foobar.product.pasture_product.*;
import foobar.Building.StoreHouse;

public class PastureFactory extends BaseFactory {
    @Override
    public BaseProduct getAnimal(String animalName){
        if(animalName == null){
            return null;
        }
        if(animalName.equalsIgnoreCase("Chicken")){
            return new Chicken();
        } else if(animalName.equalsIgnoreCase("Fish")){
            return new Fish();
        } else if(animalName.equalsIgnoreCase("Frog")){
            return new Frog();
        } else if(animalName.equalsIgnoreCase("Mutton")){
            return new Mutton();
        } else if(animalName.equalsIgnoreCase("Pork")){
            return new Pork();
        }
        return null;
    }
    @Override
    public BaseProduct getPlant(String plant){
        return null;
    }
}