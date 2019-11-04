package foobar.building;

import foobar.building.base.Building;
import foobar.plant.farm.Plantable;

import java.util.ArrayList;
//import foobar.plant.farm.plantable;

public class Farm extends Building {

    private ArrayList<Plantable> plantables = new ArrayList<Plantable>();
    private int digged;

    @Override
    public boolean add(Object object) {
        if (!(object instanceof Plantable)) {
            System.out.println("Farm only can store plant");
            return false;
        }
        if (plantables.size() >= capacity) {
            System.out.println("Farm " + name + " is full, can't add");
        }
        plantables.add((Plantable) object);
        return true;
    }

    @Override
    public boolean remove(Object object) {
        if (!(object instanceof Plantable)) {
            System.out.println("Farm only can remove foobar.plant");
            return false;
        }
//        for (Object p : stored) {
//            plantable plant = (plantable) p;
//            // TODO how to decide input object equal with stored's foobar.plant
//            if (object == p) {
//                System.out.println("foobar.plant remove from Farm " + name);
//                return true;
//            }
//        }
        System.out.println("foobar.plant not found");
        return false;
    }

    @Override
    public void show() {

    }

    public int setDigged(){
        int workload = 1 - digged;
        digged = 1;
        return workload;
    }
}
