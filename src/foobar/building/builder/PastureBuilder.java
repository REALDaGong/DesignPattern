package foobar.building.builder;

import foobar.building.base.Building;
import foobar.building.base.BuildingBuilder;
import foobar.building.Pasture;
import logger.logger;
public class PastureBuilder extends BuildingBuilder {
    private Pasture pasture = new Pasture();
    public PastureBuilder(String name, int xlen, int ylen, int zlen) {
        super(name, xlen, ylen, zlen);
        pasture.name = name;
        pasture.xlen = xlen;
        pasture.ylen = ylen;
        pasture.zlen = zlen;
    }

    @Override
    public void prepare() {
        logger.println("New Pasture " + pasture.name + " is prepared");
    }

    @Override
    public void building() {
        logger.println("New Pasture " + pasture.name + " is builded");
    }

    @Override
    public Building GetBuilding() {
        return pasture;
    }
}
