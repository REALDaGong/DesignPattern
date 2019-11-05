package foobar.building.base;

public abstract class BuildingBuilder {

    public BuildingBuilder(String name, int xlen, int ylen, int zlen) {

    }

    public abstract void prepare();

    public abstract void building();

    public abstract Building GetBuilding();
}
