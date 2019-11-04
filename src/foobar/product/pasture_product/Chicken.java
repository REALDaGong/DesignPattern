package foobar.product.pasture_product;

import foobar.product.product_interface.BaseProduct;

public class Chicken extends BaseProduct {
    protected int SHELFLIFE;
    protected String NAME;

    public Chicken() {
        this.NAME = "chicken";
        this.SHELFLIFE = 10;
        //AnimalProxy aproxy = new AnimalProxy(store);
        //aproxy.addAnimal(this);
    }
    public String getname(){
        return this.NAME;
    }
    @Override
    public void timeLost(){
        if(SHELFLIFE > 0){
            SHELFLIFE -= 1;
        } else {
            remove();
        }
    }
    @Override
    public void remove(){
        /** 
         * storeHouse中删除
         *
         */
    }
}