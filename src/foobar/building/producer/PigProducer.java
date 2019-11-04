package foobar.building.producer;

import foobar.animal.animal.Pig;
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
            products.add(pig.produceWithDeath());
            pigs.remove(pig);
        }
        return products;
    }
}
