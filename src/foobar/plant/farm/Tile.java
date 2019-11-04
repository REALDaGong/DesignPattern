package foobar.plant.farm;

import java.util.*;

import foobar.plant.Receiver;
import foobar.plant.consumable.effect.*;
import foobar.plant.consumable.item.*;
import foobar.plant.plant_entity.*;
import foobar.product.product_interface.BaseProduct;
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
            System.out.println(this+" has no plant!");
        }
        else {
            plantSlot.FertilizerAdded(type);
            actAllFerPes();
        }
    }

    /**
     * 耕地
     */
    public int plow() {
        // TODO implement here


        if (plowState==1) {
            System.out.println("The tile has been plowed.");
            return 1;
        }else{
            System.out.println("plow!");
            plowState=1;
            return 0;
        }

    }

    //种植植物
    public void plantSeed(BasePlant seed){
        if(plowState==0){
            System.out.println("Please plow first!");
        }
        else{
            plantSlot=seed;
        }
    }

    //调用中介者，施加所有种类药剂
    private void actAllFerPes()
    {
        FMediator fMediator=new FMediator(plantSlot);
        fMediator.actAll();
    }

    @Override
    public void accept(Tool tool) {
        //if empty?
        if (plantSlot==null) {
            System.out.println("farm:Tile:plantSlot is null");
        }
        tool.visit(this);
    }
}