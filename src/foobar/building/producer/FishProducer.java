package foobar.building.producer;

import foobar.animal.animal_base.Fish;
import foobar.product.pasture_product.FishMeat;
import foobar.product.product_interface.BaseProduct;

import java.util.ArrayList;

public class FishProducer extends BaseProducer {
    ArrayList<Fish> fishs;

    public FishProducer(ArrayList<Fish> fishsInput) {
        fishs = fishsInput;
    }

    @Override
    public ArrayList<BaseProduct> produceWithDeath() {
        ArrayList<BaseProduct> products = new ArrayList<BaseProduct>();
        for (Fish fish : fishs) {
            products.add((FishMeat)fish.produceWithDeath());
        }
        fishs = new ArrayList<>();
        return products;
    }
}
