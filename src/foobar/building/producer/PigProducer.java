package foobar.building.producer;

import foobar.animal.animal_base.Pig;
import foobar.product.pasture_product.Pork;
import foobar.product.product_interface.BaseProduct;

import java.util.ArrayList;

public class PigProducer extends BaseProducer {
    ArrayList<Pig>pigs;
    public PigProducer(ArrayList<Pig> pigsInput){
        pigs=pigsInput;
    }
    @Override
    public ArrayList<BaseProduct> produceWithDeath() {
        ArrayList<BaseProduct> products = new ArrayList<BaseProduct>();
        for (Pig pig : pigs) {
            products.add((Pork)pig.produceWithDeath());
        }
        pigs = new ArrayList<>();
        return products;
    }
}
