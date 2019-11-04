package foobar.building.producer;

import foobar.animal.animal.Chicken;
import foobar.product.product_interface.BaseProduct;

import java.util.ArrayList;

public class ChickenProducer extends BaseProducer {
    ArrayList<Chicken> chickens;

    public ChickenProducer(ArrayList<Chicken> chickensInput){
        chickens=chickensInput;
    }

    @Override
    public ArrayList<BaseProduct> produceWithDeath() {
        ArrayList<BaseProduct> products = new ArrayList<BaseProduct>();
        for (Chicken chicken : chickens) {
            products.add(chicken.produceWithDeath());
            chickens.remove(chicken);
        }
        return products;
    }

    public ArrayList<BaseProduct> produceWithoutDeath() {
        ArrayList<BaseProduct> products = new ArrayList<BaseProduct>();
        for (Chicken chicken : chickens) {
            products.add(chicken.produceWithoutDeath());
        }
        return products;
    }
}
