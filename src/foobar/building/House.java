package foobar.building;

import foobar.building.base.Building;


public class House extends Building {
    @Override
    public boolean add(Object object) {
//        if (!(object instanceof People)) {
//            System.out.println("House just can store people");
//            return false;
//        }
//
//        if (stored.size() == capacity) {
//            System.out.println("House is full");
//            return false;
//        }
//
//        stored.add(object);
//        System.out.println("House has " + stored.size() + " people");
        return true;
    }

    @Override
    public boolean remove(Object object) {
//        for (Object p : stored
//        ) {
//            People people = (People) p;
//            People objectpeople = (People) object;
//            if (people.name == objectpeople.name) {
//                stored.remove(p);
//                System.out.println("remove " + people.name);
//                return true;
//            }
//        }
//        System.out.println("person not found");
        return false;
    }

    @Override
    public void show() {

    }
}
