package foobar.product.proxy;

import foobar.Building.*;
import foobar.product.product_interface.*;
import foobar.product.adapter.Adapter;

public class PlantProxy extends Adapter {
	private StoreHouse myshop;
	
	public PlantProxy(StoreHouse store) {
		this.myshop = store;
	}
	
	@Override
	public void addAngle(BaseProduct plantProduct) {
		this.myshop.addAngle(plantProduct);
	}
	@Override
	public void addDemon(BaseProduct plantProduct) {
		this.myshop.addBattle(plantProduct);
	}
	@Override
	public void addBattle(BaseProduct plantProduct) {
		this.myshop.addDemon(plantProduct);
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
