package foobar.building;

import foobar.building.building_abstract.Building;

public class Pasture extends Building {
    @Override
    public boolean Add(Object object) {
        return false;
    }

    @Override
    public boolean Remove(Object object) {
        return false;
    }
}
