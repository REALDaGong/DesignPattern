package foobar.Building.Builder;


import foobar.Building.Abstract.Building;
import foobar.Building.Abstract.BuildingBuilder;
import foobar.Building.House;

public class HouseBuilder extends BuildingBuilder {
    private House house = new House();

    public HouseBuilder(String name, int xlen, int ylen, int zlen) {
        super(name, xlen, ylen, zlen);
        house.name = name;
        house.xlen = xlen;
        house.ylen = ylen;
        house.zlen = zlen;
    }

    @Override
    public void Prepare() {
        System.out.println("New House " + house.name + " foobar.Building is prepared");
    }

    @Override
    public void SetCapacity() {
        house.capacity = (int) (house.xlen * house.ylen * house.zlen / 25);
        System.out.println("New House " + house.name + " can store " + house.capacity + " people");
    }


    @Override
    public Building GetBuilding() {
        return house;
    }
}
