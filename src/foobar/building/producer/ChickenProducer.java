package foobar.building.producer;

import foobar.animal.animal_base.Chicken;
import foobar.product.pasture_product.ChickenMeat;
import foobar.product.pasture_product.Egg;
import foobar.product.product_interface.BaseProduct;

import java.util.ArrayList;

public class ChickenProducer extends BaseProducer {
    ArrayList<Chicken> chickens;

    public ChickenProducer(ArrayList<Chicken> chickensInput){
        chickens=chickensInput;
    }

    @Override
    public ArrayList<BaseProduct> produceWithDeath() {
        ArrayList<BaseProduct> products = new ArrayList<>();
        for (Chicken chicken : chickens) {
            ChickenMeat chickenMeat = (ChickenMeat) chicken.produceWithDeath();
            products.add(chickenMeat);
        }
       chickens = new ArrayList<Chicken>();
        return products;
    }

    public ArrayList<BaseProduct> produceWithoutDeath() {
        ArrayList<BaseProduct> products = new ArrayList<>();
        for (Chicken chicken : chickens) {
            products.add((Egg)chicken.produceWithoutDeath());
        }
        return products;
    }
}
