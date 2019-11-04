package foobar.product.proxy;

import foobar.Building.StoreHouse;
import foobar.product.product_interface.*;
import foobar.product.adapter.Adapter;

public class AnimalProxy extends Adapter {
    private StoreHouse myshop;

    public AnimalProxy(StoreHouse store) {
        this.myshop = store;
    }

    @Override
    public void addPlant(BaseProduct plantProduct) {

    }

    @Override
    public void addAnimal(BaseProduct animalProduct) {
        this.myshop.addAnimal(animalProduct);
    }
}
