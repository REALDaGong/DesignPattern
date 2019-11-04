package foobar.building;

import foobar.building.base.Building;
import foobar.plant.plant_entity.BasePlant;
import foobar.product.product_interface.BaseProduct;


import java.util.ArrayList;

public class StoreHouse extends Building {
    private ArrayList<BaseProduct> angelCotton = new ArrayList<BaseProduct>();
    private ArrayList<BaseProduct> demonCotton = new ArrayList<BaseProduct>();
    private ArrayList<BaseProduct> battlemelon = new ArrayList<BaseProduct>();

    private ArrayList<BaseProduct> chicken = new ArrayList<BaseProduct>();
    private ArrayList<BaseProduct> fish = new ArrayList<BaseProduct>();
    private ArrayList<BaseProduct> frog = new ArrayList<BaseProduct>();
    private ArrayList<BaseProduct> mutton = new ArrayList<BaseProduct>();
    private ArrayList<BaseProduct> pork = new ArrayList<BaseProduct>();


    @Override
    public boolean add(Object object) {
//        if (!(object instanceof BasePlant)) {
//            System.out.println("Store House only can store Plant");
//        }
//        BasePlant plant = (BasePlant) object;
//
//        if (angelCotton.size() + demonCotton.size() + battlemelon.size() >= capacity) {
//            System.out.println("Store House " + name + " is full");
//            return false;
//        }
//
//        switch (plant) {
//            case "angelcotton":
//                angelCotton.add(plant);
//                break;
//            case "demoncotton":
//                demonCotton.add(plant);
//                break;
//            case "battlemelon":
//                battlemelon.add(plant);
//                break;
//            default:
//                System.out.println("Error Product");
//                return false;
//        }
        return true;
    }

    @Override
    public boolean remove(Object object) {
        return false;
    }

    @Override
    public void show() {
        showStore(angelCotton, "AngelCotton");
        showStore(demonCotton, "DemonCotton");
        showStore(battlemelon, "BattleMelon");
    }

    private void showStore(ArrayList<BaseProduct> store, String store_name) {
        if (store.isEmpty()) {
            System.out.println("No" + store_name + "in Store House " + name);
        } else {
            System.out.println(store_name + " :" + store.size());
        }
    }

    public void addPlant(BaseProduct product) {
        switch(product.getname()){
            case "anglecotton":
                angelCotton.add(product);
                System.out.println("AngleCotton upgrade");
                break;
            case "demoncotton":
                demonCotton.add(product);
                System.out.println("DemonCotton upgrade");
                break;
            case "battlemelon":
                battlemelon.add(product);
                System.out.println("BattleMelon upgrade");
                break;
            default:
                System.out.println("Erro Plant");
                break;
        }
    }

    public void addAnimal(BaseProduct animal){
        switch(animal.getname()){
            case "chicken":
                chicken.add(animal);
                System.out.println("Chicken upgrade");
                break;
            case "fish":
                fish.add(animal);
                System.out.println("Fish upgrade");
                break;
            case "frog":
                frog.add(animal);
                System.out.println("Frog upgrade");
                break;
            case "mutton":
                mutton.add(animal);
                System.out.println("Mutton upgrade");
                break;
            case "pork":
                pork.add(animal);
                System.out.println("Pork upgrade");
                break;
            default:
                break;
        }
    }

}
