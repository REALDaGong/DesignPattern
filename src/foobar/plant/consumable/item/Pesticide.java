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
    public Pesticide() {
    }

    /**
     * 
     */
    private ArrayList<BaseEffect> moreEffect=new ArrayList<BaseEffect>();

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
    public void addEffect(BaseEffect effect) {
        // TODO implement here
        moreEffect.add(effect);
    }

    /**
     *
     */
    public void act() {
        // TODO implement here
        baseEffect.act();
        for(BonusEffect i:moreEffect){
            i.act();
        }
    }

    public BonusEffect getBonusEffect() {
        return baseEffect;
    }

    public void setBonusEffect(BonusEffect bonusEffect){
        baseEffect=bonusEffect;
    }

    //中介者模式
    private FPMediator mediator;

    public FPMediator getMediator(){
        return mediator;
    }

    public void setMediator(FPMediator mediator) {
        this.mediator = mediator;
    }
}