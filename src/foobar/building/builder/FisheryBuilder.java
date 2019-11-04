package foobar.building.builder;

import foobar.building.building_abstract.Building;
import foobar.building.building_abstract.BuildingBuilder;
import foobar.building.Fishery;

public class FisheryBuilder extends BuildingBuilder {

    private Fishery fishery = new Fishery();

    public FisheryBuilder(String name, int xlen, int ylen, int zlen) {
        super(name, xlen, ylen, zlen);
        fishery.name = name;
        fishery.xlen = xlen;
        fishery.ylen = ylen;
        fishery.zlen = zlen;
    }

    @Override
    public void Prepare() {
        System.out.println("New Fishery " + fishery.name + " foobar.Building is prepared");
    }

    @Override
    public void SetCapacity() {
        fishery.capacity = fishery.xlen * fishery.ylen * fishery.zlen;
        System.out.println("New Fishery " + fishery.name + " can store " + fishery.capacity + " fish");
    }

    @Override
    public Building GetBuilding() {
        return fishery;
    }
}
