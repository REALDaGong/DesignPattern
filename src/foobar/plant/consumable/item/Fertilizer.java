package foobar.plant.consumable.item;

import java.util.*;

import foobar.plant.consumable.effect.BaseEffect;
import foobar.plant.consumable.effect.BonusEffect;

/**
 * 工厂产品，同时也是桥接的一方，另一方是moreEffect中的效果，可以指定多个
 */
public class Fertilizer {

    /**
     * Default constructor
     */
    public Fertilizer(String brand,int size) {
        this.brand=brand;
        this.size=size;
        this.description="没有描述";
        this.baseEffect=new BaseEffect();
    }
    public Fertilizer(String brand,int size,String description) {
        this.brand=brand;
        this.size=size;
        this.description=description;
        this.baseEffect=new BaseEffect();
    }
    public Fertilizer(String brand,int size,String description,BonusEffect effect) {
        this.brand=brand;
        this.size=size;
        this.description=description;
        this.baseEffect=effect;
    }


    /**
     *  "附加效果"
     */
    private ArrayList<BonusEffect> moreEffect=new ArrayList<BonusEffect>();

    /**
     *  这个东西的量有多大（未使用）
     */
    private int size;

    /**
     *  牌子
     */
    private String brand;

    /**
     *  描述
     */
    private String description;

    /**
     *  基础效果
     */
    private BonusEffect baseEffect;


    /**
     * @param effect 加入一种效果到附加效果上
     */
    public void addEffect(BonusEffect effect) {

        moreEffect.add(effect);
    }

    /**
     * 发挥作用，目前只是输出所有效果的描述
     */
    public void act() {
        // TODO implement here
        baseEffect.act();
        for(BonusEffect i:moreEffect){
            i.act();
        }
    }

    //返回这个化肥的所有效果
    public ArrayList<BonusEffect> getEffect() {
        ArrayList<BonusEffect> output=moreEffect;
        output.add(baseEffect);
        return output;
    }

    //设置这个化肥的基础效果
    public void setBonusEffect(BonusEffect bonusEffect){
        baseEffect=bonusEffect;
    }

    //获得这个化肥的品牌描述
    public String getBrand(){
        return brand;
    }

}