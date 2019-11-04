package foobar.plant.consumable.item;

import java.util.*;

import foobar.plant.consumable.effect.*;

/**
 * 工厂产品，同时也是桥接的一方，另一方是moreEffect中的效果，可以指定多个
 */
public class Pesticide {

    /**
     * Default constructor
     */

    public Pesticide(String brand,int size) {
        this.brand=brand;
        this.size=size;
        this.description="没有描述";
        this.baseEffect=new BaseEffect();
    }
    public Pesticide(String brand,int size,String description) {
        this.brand=brand;
        this.size=size;
        this.description=description;
        this.baseEffect=new BaseEffect();
    }
    public Pesticide(String brand,int size,String description,BonusEffect effect) {
        this.brand=brand;
        this.size=size;
        this.description=description;
        this.baseEffect=effect;
    }

    /**
     * 
     */
    private ArrayList<BonusEffect> moreEffect=new ArrayList<BonusEffect>();

    /**
     * 
     */
    private int size;

    /**
     * 
     */
    private String brand;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private BonusEffect baseEffect;


    /**
     * @param effect
     */
    public void addEffect(BonusEffect effect) {

        moreEffect.add(effect);
    }

    /**
     *
     */
    public void act() {

        baseEffect.act();
        for(BonusEffect i:moreEffect){
            i.act();
        }
    }

    public ArrayList<BonusEffect> getEffect() {
        ArrayList<BonusEffect> output=moreEffect;
        output.add(baseEffect);
        return output;
    }

    public void setBonusEffect(BonusEffect bonusEffect){
        baseEffect=bonusEffect;
    }

}