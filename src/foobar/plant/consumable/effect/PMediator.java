package foobar.plant.consumable.effect;
import logger.logger;
import foobar.plant.consumable.item.*;
import foobar.plant.plant_entity.BasePlant;

import java.lang.reflect.Array;
import java.util.ArrayList;
/**
 * 中介者模式，管理每个效果是如何被施加到植物上的
 */
public class PMediator implements Mediator {

    private BasePlant basePlant=null;
    private Pesticide pesticide=null;
    private ArrayList<BonusEffect> effects=new ArrayList<>();
    //初始化中介者

    public PMediator(BasePlant plant) {
        basePlant=plant;
    }

    public void addPesticide(Pesticide input){
        pesticide=input;
        unPackageEffects();
    }
    public void setBasePlant(BasePlant input){
        basePlant=input;
    }
    private void unPackageEffects(){
        if(pesticide!=null){
            for(BonusEffect i: pesticide.getEffect()){
                effects.add(i);
            }
        }
    }

    @Override
    //所有药剂发挥作用
    public void actAll() {
        if (basePlant==null){
            logger.println("[FATAL] plant:consumable:effect:Mediator:no plant added");
        }
        logger.println("effect:");
        for(BonusEffect i:effects){
            //施加所有效果到植物上，现在只是显示一下
            i.act();
        }
    }
}
