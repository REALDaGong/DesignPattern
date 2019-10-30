package foobar.Building.Builder;

import foobar.Building.Abstract.Building;
import foobar.Building.Abstract.BuildingBuilder;
import foobar.Building.StoreHouse;

public class StoreHouseBuilder extends BuildingBuilder {
    private StoreHouse storeHouse = new StoreHouse();
    public StoreHouseBuilder(String name, int xlen, int ylen, int zlen) {
        super(name, xlen, ylen, zlen);
        storeHouse.name = name;
        storeHouse.xlen = xlen;
        storeHouse.ylen = ylen;
        storeHouse.zlen = zlen;
    }

    @Override
    public void Prepare() {
        System.out.println("New storeHouse " + storeHouse.name + " foobar.Building is prepared");
    }

    @Override
    public void SetCapacity() {
        storeHouse.capacity = storeHouse.xlen * storeHouse.ylen * storeHouse.zlen;
        System.out.println("New StoreHouse " + storeHouse.name + " can store " + storeHouse.capacity + " things");
    }

    @Override
    public Building GetBuilding() {
        return storeHouse;
    }
}
