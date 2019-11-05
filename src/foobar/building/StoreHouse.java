package foobar.building;

import foobar.building.base.Building;
import foobar.product.farm_product.AngleCotton;
import foobar.product.farm_product.BattleMelon;
import foobar.product.farm_product.DemonCotton;
import foobar.product.pasture_product.*;
import foobar.product.product_interface.BaseProduct;

import java.util.ArrayList;
import logger.logger;
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
        logger.println("Chicken :" + chicken.size());
        logger.println("Fish :" + fish.size());
        logger.println("Frog :" + frog.size());
        logger.println("Pork :" + pork.size());
        logger.println("Mutton :" + mutton.size());
        logger.println("Egg :" + egg.size());
        logger.println("Wool :" + wool.size());
        logger.println("AngelCotton :" + angelCotton.size());
        logger.println("DemonCotton :" + demonCotton.size());
        logger.println("BattleMelon :" + battlemelon.size());
    }

    public void addPlant(BaseProduct product) {
        switch (product.getname()) {
            case "anglecotton":
                angelCotton.add((AngleCotton) product);
                logger.println("AngleCotton upgrade");
                break;
            case "demoncotton":
                demonCotton.add((DemonCotton) product);
                logger.println("DemonCotton upgrade");
                break;
            case "battlemelon":
                battlemelon.add((BattleMelon) product);
                logger.println("BattleMelon upgrade");
                break;
            default:
                logger.println("Error Plant");
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
