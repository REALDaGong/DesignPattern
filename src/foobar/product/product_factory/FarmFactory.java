package foobar.product.product_factory;

import foobar.product.BaseFactory;
import foobar.Building.StoreHouse;
import foobar.product.product_interface.*;
import foobar.product.farm_product.*;

public class FarmFactory extends BaseFactory {
    public int battleMelon = 0;
    public int angleCotton = 0;
    public int demonCotton = 0;

    @Override
    public BaseProduct getPlant(String plantName){
        if(plantName == null){
            return null;
        }
        if(plantName.equalsIgnoreCase("AngleCotton")){
            return new AngleCotton();
        } else if(plantName.equalsIgnoreCase("DemonCotton")){
            return new DemonCotton();
        } else if(plantName.equalsIgnoreCase("BattleMelon")){
            return new BattleMelon();
        }
        return null;
    }

    @Override
    public BaseProduct getAnimal(String animal){
        return null;
    }
}