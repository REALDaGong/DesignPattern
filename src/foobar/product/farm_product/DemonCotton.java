package foobar.product.farm_product;

import foobar.product.product_interface.BaseProduct;

public class DemonCotton extends BaseProduct {
    protected int SHELFLIFE;
    protected String NAME;

    public DemonCotton() {
        this.NAME = "demoncotton";
        this.SHELFLIFE = 10;
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