package foobar.building;

import foobar.building.base.Building;
import foobar.plant.farm.Plantable;
import foobar.plant.farm.Tile;
import foobar.plant.plant_entity.BasePlant;
import foobar.product.product_interface.BaseProduct;

import java.util.ArrayList;
import logger.logger;

public class Farm extends Building {

    private ArrayList<Plantable> plantables = new ArrayList<Plantable>();
    private int digged;


    public boolean add(Plantable object) {
        if (!(object instanceof Plantable)) {
            logger.println("Farm only can store plant");
            return false;
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

    public ArrayList<BaseProduct> harvestAll() {
        ArrayList<BaseProduct> products = new ArrayList<BaseProduct>();
        for (Plantable plantable : plantables) {
            if (plantable instanceof Tile) {
                Tile tile = (Tile) plantable;
                BasePlant plant = tile.getPlant();
                ArrayList<BaseProduct> product = plant.harvest();
                product.forEach(i -> products.add(i));
            }
        }
        return products;
    }
}
