package foobar.product.proxy;

import foobar.Building.*;
import foobar.product.product_interface.*;
import foobar.product.adapter.Adapter;

public class Proxy extends Adapter {
	private StoreHouse myshop;
	
	public Proxy() {
		this.myshop = new StoreHouse();
	}
	
	@Override
	public void addAngle(BaseProduct plantProduct) {
		myshop.addAngle(plantProduct);
	}
	@Override
	public void addDemon(BaseProduct plantProduct) {
		myshop.addBattle(plantProduct);
	}
	@Override
	public void addBattle(BaseProduct plantProduct) {
		myshop.addDemon(plantProduct);
	}

	@Override
	public void addChicken(BaseProduct baseProduct) {

	}

	@Override
	public void addFish(BaseProduct baseProduct) {

	}

	@Override
	public void addFrog(BaseProduct baseProduct) {

	}

	@Override
	public void addMutton(BaseProduct baseProduct) {

	}

	@Override
	public void addPork(BaseProduct baseProduct) {

	}

}
