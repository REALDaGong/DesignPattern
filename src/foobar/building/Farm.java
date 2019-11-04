package foobar.building;

import foobar.building.building_abstract.Building;
import foobar.plant.farm.Plantable;

public class Farm extends Building {
    @Override
    public boolean Add(Object object) {
        if (!(object instanceof Plantable)) {
            System.out.println("Farm only can store foobar.plant");
            return false;
        }
        // TODO foobar.plant’s capacity calculate

        stored.add(object);
        System.out.println("Add foobar.plant to Farm " + name + " succeed");
        return true;
    }

    @Override
    public boolean Remove(Object object) {
        if (!(object instanceof Plantable)) {
            System.out.println("Farm only can remove foobar.plant");
            return false;
        }
        for (Object p : stored) {
            Plantable plant = (Plantable) p;
            // TODO how to decide input object equal with stored's foobar.plant
            if (object == p) {
                System.out.println("foobar.plant remove from Farm " + name);
                return true;
            }
        }
        System.out.println("foobar.plant not found");
        return false;
    }
}
