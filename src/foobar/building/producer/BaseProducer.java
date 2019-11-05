package foobar.building.producer;

import foobar.product.product_interface.BaseProduct;

import java.util.ArrayList;

abstract class BaseProducer {
    private  ArrayList<BaseProduct>products;
    abstract public ArrayList<BaseProduct> produceWithDeath();
}
