package foobar.building;

import foobar.animal.animal.*;
import foobar.building.base.Building;
import foobar.product.product_interface.BaseProduct;

import java.util.ArrayList;

public class Pasture extends Building {
    ArrayList<Chicken> chickens = new ArrayList<Chicken>();
    ArrayList<Fish> fishs = new ArrayList<Fish>();
    ArrayList<Frog> frogs = new ArrayList<Frog>();
    ArrayList<Pig> pigs = new ArrayList<Pig>();
    ArrayList<Sheep> sheeps = new ArrayList<Sheep>();

    public boolean addAnimal(String type) {
        switch (type) {
            case "Chicken":
                Chicken chicken = new Chicken();
                chickens.add(chicken);
                System.out.println("New Chicken is added in Paseture " + name);
            case "Fish":
                Fish fish = new Fish();
                fishs.add(fish);
                System.out.println("New Fish is added in Pasture " + name);
            case "Frog":
                Frog frog = new Frog();
                frogs.add(frog);
                System.out.println("New Frog is added in Pasture " + name);
            case "Pig":
                Pig pig = new Pig();
                pigs.add(pig);
                System.out.println("New Pig is added in Pasture " + name);
            case "Sheep":
                Sheep sheep = new Sheep();
                sheeps.add(sheep);
                System.out.println("New Sheep is added in Pasture " + name);
            default:
                System.out.println("Error Animal Type");
        }
        return false;
    }


    public void breed() {
        for (Chicken chicken : chickens) {
            if (chicken.checkFertility()) {
                Chicken newChicken = chicken.breed();
                chickens.add(newChicken);
            }
        }

        for (Fish fish : fishs) {
            if (fish.checkFertility()) {
                Fish newFish = fish.breed();
                fishs.add(newFish);
            }
        }

        for (Frog frog : frogs) {
            if (frog.checkFertility()) {
                Frog newFrog = frog.breed();
                frogs.add(frog);
            }
        }

        for (Pig pig : pigs) {
            if (pig.checkFertility()) {
                Pig newPig = pig.breed();
                pigs.add(pig);
            }
        }

        for (Sheep sheep : sheeps) {
            if (sheep.checkFertility()) {
                Sheep newSheep = sheep.breed();
                sheeps.add(sheep);
            }
        }
        System.out.println("Pasture " + name + ", all animal breed");
        show();
    }

    public void eat() {
        for (Chicken chicken : chickens) {
            chicken.eat();
        }

        for (Fish fish : fishs) {
            fish.eat();
        }

        for (Frog frog : frogs) {
            frog.eat();
        }

        for (Pig pig : pigs) {
            pig.eat();
        }

        for (Sheep sheep : sheeps) {
            sheep.eat();
        }
        System.out.println("Pasture " + name + ",all animal eat something");
    }

    public void setHungry() {
        for (Chicken chicken : chickens) {
            chicken.setHungry();
        }

        for (Fish fish : fishs) {
            fish.setHungry();
        }

        for (Frog frog : frogs) {
            frog.setHungry();
        }

        for (Pig pig : pigs) {
            pig.setHungry();
        }

        for (Sheep sheep : sheeps) {
            sheep.setHungry();
        }
        System.out.println("Pasture " + name + ",all animal are hungry");
    }

    public ArrayList<BaseProduct> produceWithDeath() {

        ArrayList<BaseProduct> products = new ArrayList<BaseProduct>();
        ProduceFacade facade = new ProduceFacade(this);
        products=facade.produceWithDeathAll();
//        for (Chicken chicken : chickens) {
//            products.add(chicken.produceWithDeath());
//            chickens.remove(chicken);
//        }
//
//        for (Fish fish : fishs) {
//            products.add(fish.produceWithDeath());
//            fishs.remove(fish);
//        }
//
//        for (Frog frog : frogs) {
//            products.add(frog.produceWithDeath());
//            frogs.remove(frog);
//        }
//
//        for (Pig pig : pigs) {
//            products.add(pig.produceWithDeath());
//            pigs.remove(pig);
//        }
//
//        for (Sheep sheep : sheeps) {
//            products.add(sheep.produceWithDeath());
//            sheeps.remove(sheep);
//        }
        return products;
    }

    public ArrayList<BaseProduct> produceWithoutDeath() {
        ArrayList<BaseProduct> products = new ArrayList<BaseProduct>();
        ProduceFacade facade = new ProduceFacade(this);
        products=facade.produceWithoutDeathAll();
//        for (Chicken chicken : chickens) {
//            products.add(chicken.produceWithoutDeath());
//        }
//
//        for (Sheep sheep : sheeps) {
//            products.add(sheep.produceWithDeath());
//        }

        return products;
    }

    @Override
    public void show() {
        System.out.println("Pasture " + name + ":");
        System.out.println("Chicken :" + chickens.size());
        System.out.println("Fish :" + fishs.size());
        System.out.println("Frog :" + frogs.size());
        System.out.println("Pig :" + pigs.size());
        System.out.println("Sheep :" + sheeps.size());
    }
}
