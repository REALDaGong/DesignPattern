package foobar.building;

import foobar.building.base.Building;
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
    private ArrayList<BaseProduct> egg = new ArrayList<BaseProduct>();
    private ArrayList<BaseProduct> wool = new ArrayList<BaseProduct>();


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
                System.out.println("Error Plant");
                break;
        }
    }

    public void addAnimal(ArrayList<BaseProduct> products) {
        for (BaseProduct product : products) {
            switch (product.getname()) {
                case "chicken":
                    chicken.add(product);
                    break;
                case "fish":
                    fish.add(product);
                    break;
                case "frog":
                    frog.add(product);
                    break;
                case "pork":
                    pork.add(product);
                    break;
                case "sheep":
                    mutton.add(product);
                    break;
                case "egg":
                    egg.add(product);
                    break;
                case "wool":
                    wool.add(product);
                    break;
            }
        }
    }

}
