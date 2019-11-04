package foobar.plant.plant_entity;

import java.util.*;

import foobar.plant.Receiver;
import foobar.plant.consumable.effect.PMediator;
import foobar.plant.consumable.item.*;
import foobar.plant.farm.*;
import foobar.plant.period.*;
import foobar.plant.plant_profile.*;
import foobar.product.product_interface.BaseProduct;
import foobar.tool.Tool;


/**
 * 具体植物的基类，内含享元模式，访问者模式，观察者模式
 */


//todo:收获后自己消失
public class BasePlant implements AddFertilizerEventObserver, Receiver {

    /**
     * Default constructor
     */
    public BasePlant(BasePlantProfile profile,String name) {
        this.Profile=profile;
        this.name=name;
    }

    /**
     *  植物的基本属性
     */
    private BasePlantProfile Profile;

    /**
     *  目前的状态
     */
    private Period Currentperiod=new Seed();

    /**
     *  生命值
     */
    private int CurrentHealth;

    /**
     *  干枯值
     */
    private int CurrentThirsty;

    private int currentWeed;
    /**
     *  杂草量
     */
    private String name;

    /**长大，进入下一阶段
     * @return
     */
    public void grow() {
        // TODO implement here
        if(Currentperiod.getNextPeriod()!=null){
            Currentperiod=Currentperiod.getNextPeriod();
            System.out.println("plant grow! period desc:"+Currentperiod.getDescription());
        }

    }
    //收获植物，如果没长好就返回空数组
    public ArrayList<BaseProduct> harvest(){
        if(this.riped()){
            System.out.println("plant harvest!");
            return Profile.getProduct();

        }
        return new ArrayList<BaseProduct>();
    }
    //判断是否成熟，如果成熟返回true
     private boolean riped(){
        if (Currentperiod.getNextPeriod() !=null){
            return false;
        }
        return true;
     }
    /**
     * @param pesticideType
     */
    //中介者模式，中介者负责“翻译”所有效果
    public void pesticided(Pesticide pesticideType) {
        // TODO implement here
        PMediator med=new PMediator(this);
        med.addPesticide(pesticideType);
        med.actAll();
    }

    /**浇水
     * 1=success
     * 0=fail
     * @return
     */
    public int watered(int water) {

        System.out.println("The Plant has been watered!");
        return 1;
    }


    /**
     *  这个方法会监听到土地被施肥后使用.
     */
    public void FertilizerAdded(Fertilizer type) {
        // TODO implement here
        System.out.println(type+"has been added");
    }

    public void pullWeed(){
        currentWeed=0;
        System.out.println("The Weed has been pulled!");
    }

    public String getName(){
        return name;
    }

    //访问者模式的accept.
    @Override
    public void accept(Tool tool) {
        tool.visit(this);
    }

    public BasePlant clone(){
        return new BasePlant(this.Profile,this.name);
    }
}