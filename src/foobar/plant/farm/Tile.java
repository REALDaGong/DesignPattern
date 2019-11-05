package foobar.plant.farm;

import java.util.*;
import logger.logger;
import foobar.plant.Receiver;
import foobar.plant.consumable.effect.*;
import foobar.plant.consumable.item.*;
import foobar.plant.plant_entity.*;
import foobar.tool.Tool;

/**
 * 植物所在的一小块田地
 * 应用了观察者模式(addFrerti)，访问者模式(tool)
 *
 */
public class Tile implements Plantable, Receiver {

    /**
     * Default constructor
     */
    public Tile() {
    }
    public BasePlant getPlant(){
        return plantSlot;
    }
    /**
     * 氮
     */
    public int nitrogen=0;

    /**
     * 磷
     */
    public int phosphor=0;

    /**
     * 钾
     */
    public int kalium=0;

    /**
     * 
     */
    public Set<BonusEffect> magicEffect;

    /**
     * 其中的植物
     */
    public BasePlant plantSlot=null;

    //地块的状态（耕没耕地
    private int plowState=0;

    /**
     * notifyObserver
     * @param type
     */
    public void addFertilizer(Fertilizer type) {
        if(plantSlot==null) {
            logger.println("该地块上没有植物");
        }
        else {
            plantSlot.FertilizerAdded(type);
            actAllFerPes(type);
            logger.println("施加完毕");
        }
    }

    /**
     * 耕地
     */
    public int plow() {
        // TODO implement here


        if (plowState==1) {
            logger.println("已经被耕过了");

            return 1;
        }else{
            logger.println("耕地！");
            plowState=1;
            return 0;
        }

    }

    //种植植物
    public void plantSeed(BasePlant seed){
        if(plowState==0){
            logger.println("请先耕地");
        }
        else{
            logger.println("植物种植成功");
            plantSlot=seed;
        }
    }

    //调用中介者，施加所有种类药剂
    private void actAllFerPes(Fertilizer type)
    {
        FMediator fMediator=new FMediator(plantSlot);
        fMediator.addFertilizer(type);
        fMediator.actAll();
    }

    @Override
    public void accept(Tool tool) {
        //if empty?
        if (plantSlot==null) {
            logger.println("该地块上没有植物");
        }
        tool.visit(this);
    }
}