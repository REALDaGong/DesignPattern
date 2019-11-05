package foobar.building;

import foobar.building.producer.*;
import foobar.product.product_interface.BaseProduct;

import java.util.ArrayList;

public class ProduceFacade {
    ChickenProducer chickenProducer;
    SheepProducer sheepProducer;
    FishProducer fishProducer;
    FrogProducer frogProducer;
    PigProducer pigProducer;

    ProduceFacade(Pasture pasture) {
        chickenProducer = new ChickenProducer(pasture.chickens);
        sheepProducer = new SheepProducer(pasture.sheeps);
        fishProducer = new FishProducer(pasture.fishs);
        frogProducer = new FrogProducer(pasture.frogs);
        pigProducer = new PigProducer(pasture.pigs);
    }


    ArrayList<BaseProduct> produceWithDeathAll() {
        ArrayList<BaseProduct> products = new ArrayList<>();
        chickenProducer.produceWithDeath().forEach(i->products.add(i));
        sheepProducer.produceWithDeath().forEach(i->products.add(i));
        fishProducer.produceWithDeath().forEach(i->products.add(i));
        frogProducer.produceWithDeath().forEach(i->products.add(i));
        pigProducer.produceWithDeath().forEach(i->products.add(i));
        return products;
    }

    ArrayList<BaseProduct> produceWithoutDeathAll() {
        ArrayList<BaseProduct> products = new ArrayList<>();

        chickenProducer.produceWithoutDeath().forEach(i->products.add(i));
        sheepProducer.produceWithoutDeath().forEach(i->products.add(i));
        return products;
    }
}
