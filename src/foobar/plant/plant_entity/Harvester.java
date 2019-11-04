package foobar.plant.plant_entity;

import foobar.Building.StoreHouse;
import foobar.product.product_interface.BaseProduct;
import foobar.product.proxy.AnimalProxy;
import foobar.product.proxy.PlantProxy;

import javax.management.openmbean.ArrayType;
import java.util.ArrayList;

public class Harvester {
    private StoreHouse store=null;
    public Harvester(StoreHouse house){
        this.store=house;


    }

    public int harvest(BasePlant plant){
        ArrayList<BaseProduct> allProduct=plant.harvest();
        PlantProxy aproxy = new PlantProxy(store);
        for (BaseProduct i:allProduct
             ) {
            aproxy.addPlant(i);
        }
        return allProduct.size();
    }


}