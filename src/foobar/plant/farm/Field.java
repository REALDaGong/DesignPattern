package foobar.plant.farm;

import java.util.*;

import foobar.plant.Receiver;
import foobar.plant.consumable.item.*;
import foobar.plant.plant_entity.BasePlant;
import foobar.tool.Tool;

/**
 * 一整块田地,利用了组合模式 Field->许多Tile,当然貌似Tile下再加Tile有些不合理，所以就没加
 */
public class Field implements Plantable, Receiver {

    //存储的所有地块
    public ArrayList<Plantable> tiles=new ArrayList<Plantable>();


    /**
     * @param c
     */
    public void reclamation(Plantable c) {
        // TODO implement here
        tiles.add(c);
    }

    /**
     * @param c
     */
    public void abandon(Plantable c) {
        // TODO implement here
        tiles.remove(c);
    }

    /**
     * @param index 
     * @return
     */
    public Plantable getchild(int index) {
        // TODO implement here
        return tiles.get(index);
    }

    /**
     * 
     */
    public int plow() {
        // TODO implement here
        int totalState=0;
        for(Plantable i:tiles){
            int state=i.plow();
            if(state==1){
                totalState=1;
            }
        }
        return  totalState;
    }

    /**添加使用一种药剂
     * @param type
     */
    public void addFertilizer(Fertilizer type) {
        //为下面的地块调用中介者，施加所有种类药剂
        for(Plantable i :tiles){
            i.addFertilizer(type);
        }
    }
    //向子地块分发拷贝，和单独种植子地块的行为有所不同。
    @Override
    public void plantSeed(BasePlant seed) {
        for(Plantable i :tiles){
            i.plantSeed(seed);
        }
    }

    //访问者模式，和tool配合
    @Override
    public void accept(Tool tool) {
        //if empty?
        for(Plantable i :tiles){
            ((Tile)i).accept(tool);
        }
    }
}