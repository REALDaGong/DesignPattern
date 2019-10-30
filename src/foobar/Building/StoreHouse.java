package foobar.Building;

import foobar.Building.Abstract.Building;

public class StoreHouse extends Building {
    @Override
    public boolean Add(Object object) {
        return false;
    }

    @Override
    public boolean Remove(Object object) {
        return false;
    }
}
