package foobar.plant.consumable.effect;

import foobar.plant.consumable.item.Fertilizer;
import foobar.plant.consumable.item.Pesticide;
import foobar.plant.farm.Plantable;
import foobar.plant.farm.Tile;
import foobar.plant.plant_entity.BasePlant;

import java.util.ArrayList;

public class FMediator implements Mediator {
    private BasePlant dirt=null;
    private Fertilizer fertilizer=null;
    private Pesticide pesticide=null;
    private ArrayList<BonusEffect> effects;

    //初始化中介者

    public FMediator(BasePlant plant) {
        dirt=plant;
    }

    public void addFertilizer(Fertilizer input){
        fertilizer=input;
        unPackageEffects();
    }

    private void unPackageEffects(){
        if(fertilizer!=null){
            for(BonusEffect i: fertilizer.getEffect()){
                effects.add(i);
            }
        }

    }

    @Override
    //所有药剂发挥作用
    public void actAll() {
        if (dirt==null){
            System.out.println("[FATAL] plant:consumable:effect:Mediator:no dirt added");

        }
        System.out.println("effect:");
        for(BonusEffect i:effects){

            //施加所有效果到植物上，现在只是显示一下
            i.act();
        }

    }
}
