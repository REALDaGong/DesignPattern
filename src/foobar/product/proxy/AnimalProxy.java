package foobar.product.proxy;

import foobar.Building.*;
import foobar.product.product_interface.*;
import foobar.product.adapter.Adapter;
import java.lang.*;
public class AnimalProxy extends Adapter {
    private StoreHouse myshop;

    public AnimalProxy(StoreHouse store) {
        this.myshop = store;
    }

    @Override
    public void addAngle(BaseProduct plantProduct) {

    }

    @Override
    public void addDemon(BaseProduct plantProduct) {

    }

    @Override
    public void addBattle(BaseProduct plantProduct) {

    }

    @Override
    public void addChicken(BaseProduct baseProduct){
		this.myshop.addChicken(baseProduct);
    }
    @Override
	public void addFish(BaseProduct baseProduct){
		this.myshop.addFish(baseProduct);
    }
    @Override
	public void addFrog(BaseProduct baseProduct){
		this.myshop.addFrog(baseProduct);
    }
    @Override
	public void addMutton(BaseProduct baseProduct){
		this.myshop.addMutton(baseProduct);
    }
    @Override
	public void addPork(BaseProduct baseProduct){
		this.myshop.addPork(baseProduct);
	}
}
