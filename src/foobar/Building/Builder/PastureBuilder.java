package foobar.Building.Builder;

import foobar.Building.Abstract.Building;
import foobar.Building.Abstract.BuildingBuilder;
import foobar.Building.Pasture;

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
    public void Prepare() {
        System.out.println("New Pasture " + pasture.name + " foobar.Building is prepared");
    }

    @Override
    public void SetCapacity() {
        pasture.capacity = pasture.xlen * pasture.ylen;
        System.out.println("New Pasture " + pasture.name + " can store " + pasture.capacity + " Animals");
    }

    @Override
    public Building GetBuilding() {
        return pasture;
    }
}
