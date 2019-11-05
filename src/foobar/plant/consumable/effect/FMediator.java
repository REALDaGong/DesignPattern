package foobar.plant.consumable.effect;

import foobar.plant.consumable.item.Fertilizer;
import foobar.plant.consumable.item.Pesticide;
import logger.logger;
import foobar.plant.plant_entity.BasePlant;

import java.util.ArrayList;

public class FMediator implements Mediator {
    private BasePlant dirt=null;
    private Fertilizer fertilizer=null;
    private Pesticide pesticide=null;
    private ArrayList<BonusEffect> effects=new ArrayList<>();

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
            logger.println("正常情况下应该看不到这条log,这说明中介者没有被正确初始化：没有传入被施加者");

        }

        logger.println("全部的效果是");
        for(BonusEffect i:effects){

            //施加所有效果到植物上，现在只是显示一下
            i.act();
        }

    }
}
