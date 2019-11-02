package foobar.product.pasture_product;

import foobar.product.product_interface.BaseProduct;

public class Sheep extends BaseProduct {
    protected int SHELFLIFE = 10;
    protected String NAME;
    @Override
    public String getname() {
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