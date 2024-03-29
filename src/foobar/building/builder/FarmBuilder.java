package foobar.building.builder;

import foobar.building.base.Building;
import foobar.building.base.BuildingBuilder;
import foobar.building.Farm;
import logger.logger;
public class FarmBuilder extends BuildingBuilder {

    private Farm farm = new Farm();

    public FarmBuilder(String name, int xlen, int ylen, int zlen) {
        super(name, xlen, ylen, zlen);
        farm.name = name;
        farm.xlen = xlen;
        farm.ylen = ylen;
        farm.zlen = zlen;
    }

    @Override
    public void prepare() {
        logger.println("New Farm " + farm.name + "  is prepared");
    }

    @Override
    public void building() {
        logger.println("New Farm " + farm.name + "  is builded");
    }

    @Override
    public Building GetBuilding() {
        return farm;
    }
}
