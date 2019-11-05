package foobar.building.producer;

import foobar.animal.animal_base.Frog;
import foobar.product.pasture_product.FrogMeat;
import foobar.product.product_interface.BaseProduct;

import java.util.ArrayList;

public class FrogProducer extends BaseProducer {
    ArrayList<Frog>frogs;
    public FrogProducer(ArrayList<Frog> frogsInput){
        frogs=frogsInput;
    }
    @Override
    public ArrayList<BaseProduct> produceWithDeath() {
        ArrayList<BaseProduct> products = new ArrayList<BaseProduct>();
        for (Frog frog : frogs) {
            products.add((FrogMeat)frog.produceWithDeath());
        }
        frogs = new ArrayList<>();
        return products;
    }
}
