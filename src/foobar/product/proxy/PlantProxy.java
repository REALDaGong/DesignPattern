package foobar.product.proxy;

import foobar.building.StoreHouse;
import foobar.product.product_interface.*;
import foobar.product.adapter.Adapter;

public class PlantProxy extends Adapter {
	private StoreHouse myshop;
	
	public PlantProxy(StoreHouse store) {
		this.myshop = store;
	}
	
	@Override
	public void addPlant(BaseProduct plantProduct) {
		this.myshop.addPlant(plantProduct);
	}

	@Override
	public void addAnimal(BaseProduct animalProduct) {

	}
}
