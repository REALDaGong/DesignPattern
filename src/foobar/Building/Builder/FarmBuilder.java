package foobar.Building.Builder;

import foobar.Building.Abstract.Building;
import foobar.Building.Abstract.BuildingBuilder;
import foobar.Building.Farm;

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
    public void Prepare() {
        System.out.println("New Farm " + farm.name + " foobar.Building is prepared");
    }

    @Override
    public void SetCapacity() {
        farm.capacity = farm.xlen * farm.ylen;
        System.out.println("New Farm " + farm.name + " can store " + farm.capacity + "foobar/plant");
    }

    @Override
    public Building GetBuilding() {
        return farm;
    }
}