package foobar.product.product_factory;

import foobar.product.BaseFactory;
import foobar.product.product_interface.*;
import foobar.product.pasture_product.*;
import foobar.Building.StoreHouse;

public class PastureFactory extends BaseFactory {
    @Override
    public BaseProduct getAnimal(String animalName, StoreHouse store){
        if(animalName == null){
            return null;
        }
        if(animalName.equalsIgnoreCase("Chicken")){
            return new Chicken(store);
        } else if(animalName.equalsIgnoreCase("Fish")){
            return new Fish(store);
        } else if(animalName.equalsIgnoreCase("Frog")){
            return new Frog(store);
        } else if(animalName.equalsIgnoreCase("Mutton")){
            return new Mutton(store);
        } else if(animalName.equalsIgnoreCase("Pork")){
            return new Pork(store);
        }
        return null;
    }
    @Override
    public BaseProduct getPlant(String plant, StoreHouse store){
        return null;
    }
}