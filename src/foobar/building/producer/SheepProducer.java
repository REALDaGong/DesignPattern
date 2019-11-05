package foobar.building.producer;

import foobar.animal.animal_base.Sheep;
import foobar.product.pasture_product.Mutton;
import foobar.product.pasture_product.Wool;
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
            products.add((Mutton)sheep.produceWithDeath());
        }
        sheeps = new ArrayList<>();
        return products;
    }

    public ArrayList<BaseProduct> produceWithoutDeath() {
        ArrayList<BaseProduct> products = new ArrayList<BaseProduct>();
        for (Sheep sheep : sheeps) {
            products.add((Wool)sheep.produceWithoutDeath());
        }
        return products;
    }
}
