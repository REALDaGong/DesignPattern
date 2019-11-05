package foobar.building;

import foobar.building.base.Building;
import foobar.product.farm_product.AngleCotton;
import foobar.product.farm_product.BattleMelon;
import foobar.product.farm_product.DemonCotton;
import foobar.product.pasture_product.*;
import foobar.product.product_interface.BaseProduct;

import java.util.ArrayList;

public class StoreHouse extends Building {

    private ArrayList<AngleCotton> angelCotton = new ArrayList<>();
    private ArrayList<DemonCotton> demonCotton = new ArrayList<>();
    private ArrayList<BattleMelon> battlemelon = new ArrayList<>();

    private ArrayList<ChickenMeat> chicken = new ArrayList<>();
    private ArrayList<FishMeat> fish = new ArrayList<>();
    private ArrayList<FrogMeat> frog = new ArrayList<>();
    private ArrayList<Mutton> mutton = new ArrayList<>();
    private ArrayList<Pork> pork = new ArrayList<>();
    private ArrayList<Egg> egg = new ArrayList<>();
    private ArrayList<Wool> wool = new ArrayList<>();


    @Override
    public void show() {
        System.out.println("Chicken :" + chicken.size());
        System.out.println("Fish :" + fish.size());
        System.out.println("Frog :" + frog.size());
        System.out.println("Pork :" + pork.size());
        System.out.println("Mutton :" + mutton.size());
        System.out.println("Egg :" + egg.size());
        System.out.println("Wool :" + wool.size());
        System.out.println("AngelCotton :" + angelCotton.size());
        System.out.println("DemonCotton :" + demonCotton.size());
        System.out.println("BattleMelon :" + battlemelon.size());
    }

    public void addPlant(BaseProduct product) {
        switch (product.getname()) {
            case "anglecotton":
                angelCotton.add((AngleCotton) product);
                System.out.println("AngleCotton upgrade");
                break;
            case "demoncotton":
                demonCotton.add((DemonCotton) product);
                System.out.println("DemonCotton upgrade");
                break;
            case "battlemelon":
                battlemelon.add((BattleMelon) product);
                System.out.println("BattleMelon upgrade");
                break;
            default:
                System.out.println("Error Plant");
                break;
        }
    }

    public void addAnimal(BaseProduct product) {
        if (product == null) {
            return;
        }
        switch (product.getname()) {
            case "chickenmeat":
                chicken.add((ChickenMeat) product);
                break;
            case "fishmeat":
                fish.add((FishMeat) product);
                break;
            case "frogmeat":
                frog.add((FrogMeat) product);
                break;
            case "pork":
                pork.add((Pork) product);
                break;
            case "mutton":
                mutton.add((Mutton) product);
                break;
            case "egg":
                egg.add((Egg) product);
                break;
            case "wool":
                wool.add((Wool) product);
                break;
        }

    }

}
