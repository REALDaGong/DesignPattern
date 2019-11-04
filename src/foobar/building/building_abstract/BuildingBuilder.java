package foobar.building.building_abstract;

public abstract class BuildingBuilder {

    public BuildingBuilder(String name, int xlen, int ylen, int zlen) {

    }

    public abstract void Prepare();

    public abstract void SetCapacity();

    public abstract Building GetBuilding();
}
