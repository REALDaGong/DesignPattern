package foobar.building.builder;

import foobar.building.base.Building;
import foobar.building.base.BuildingBuilder;
import foobar.building.StoreHouse;
import logger.logger;
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
    public void prepare() {
        logger.println("New storeHouse " + storeHouse.name + " is prepared");
    }

    @Override
    public void building() {
        logger.println("New storeHouse " + storeHouse.name + " is builded");;
    }

    @Override
    public Building GetBuilding() {
        return storeHouse;
    }
}
