package foobar.building.producer;

import foobar.animal.animal.Sheep;
import foobar.product.product_interface.BaseProduct;

import java.util.ArrayList;

public class SheepProducer extends BaseProducer {
    ArrayList<Sheep> sheeps = new ArrayList<Sheep>();
    public SheepProducer(ArrayList<Sheep> sheepsInput){
        sheeps=sheepsInput;
    }
    @Override
    public ArrayList<BaseProduct> produceWithDeath() {
        ArrayList<BaseProduct> products = new ArrayList<BaseProduct>();
        for (Sheep sheep : sheeps) {
            products.add(sheep.produceWithDeath());
            sheeps.remove(sheep);
        }
        return products;
    }

    public ArrayList<BaseProduct> produceWithoutDeath() {
        ArrayList<BaseProduct> products = new ArrayList<BaseProduct>();
        for (Sheep sheep : sheeps) {
            products.add(sheep.produceWithoutDeath());
        }
        return products;
    }
}
