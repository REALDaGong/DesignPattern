package foobar.building;

import foobar.building.base.Building;
import foobar.plant.farm.Plantable;
import foobar.plant.farm.Tile;
import foobar.plant.plant_entity.BasePlant;
import foobar.product.product_interface.BaseProduct;

import java.util.ArrayList;
//import foobar.plant.farm.plantable;

public class Farm extends Building {

    private ArrayList<Plantable> plantables = new ArrayList<Plantable>();
    private int digged;


    public boolean add(Plantable object) {
        if (!(object instanceof Plantable)) {
            System.out.println("Farm only can store plant");
            return false;
        }
        if (plantables.size() >= capacity) {
            System.out.println("Farm " + name + " is full, can't add");
        }
        plantables.add((Plantable) object);
        return true;
    }

    @Override
    public void show() {

    }

    public int setDigged() {
        int workload = 1 - digged;
        digged = 1;
        return workload;
    }

    public void harvestAll() {
        ArrayList<BaseProduct> products = new ArrayList<BaseProduct>();
        for (Plantable plantable : plantables) {
            if (plantable instanceof Tile) {
                Tile tile = (Tile) plantable;
                BasePlant plant = tile.getPlant();
                ArrayList<BaseProduct> product = plant.harvest();
                product.forEach(i -> products.add(i));
            }
        }
    }
}
