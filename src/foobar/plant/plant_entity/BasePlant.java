package foobar.plant.plant_entity;

import java.util.*;

import foobar.plant.consumable.item.*;
import foobar.plant.farm.*;
import foobar.plant.period.*;
import foobar.plant.plant_profile.*;
import foobar.product.product_interface.BaseProduct;


/**
 * 具体植物的基类
 */
public class BasePlant implements AddFertilizerEventObserver {

    /**
     * Default constructor
     */
    public BasePlant() {
    }

    /**
     * 
     */
    private BasePlantProfile Profile;

    /**
     * 
     */
    private Period Currentperiod;

    /**
     * 
     */
    private int CurrentHealth;

    /**
     * 
     */
    private int CurrentThirsty;

    private int currentWeed;
    /**
     * 
     */
    private String name;

    private PlantState state=new PlantState();

    /**
     * @return
     */
    public void grow() {
        // TODO implement here
        if(state.getState().equals("seeding"))
        {
            state.setState("ripen");
            System.out.println("Plant is ripen!");
        }
        else if(state.getState().equals("ripen"))
        {
            System.out.println("The plant has already been ripe!");
        }
    }

    //state模式，幼苗状态下处理调用killed，成熟状态下调用harves
    public ArrayList<BaseProduct> disploy(){
        if(state.getState().equals("seeding")) {
            state.killed();
            return null;
        }
        else if(state.getState().equals("ripen")){
            state.harvest();
            return  null;
        }
        return null;
    }

    /**
     * @param pesticideType
     */
    public void pesticided(Pesticide pesticideType) {
        // TODO implement here
    }

    /**
     * 1=success
     * 0=fail
     * @return
     */
    public int watered(int water) {
        // TODO implement here
        System.out.println("The Plant has been watered!");
        return 0;
    }


    /**
     * 
     */
    public void FertilizerAdded(Fertilizer type) {
        // TODO implement here
        System.out.println(type+"has been added");
        type.act();
    }

    public void pullWeed(){
        System.out.println("The weed has been pulled!");
    }

    public String getName(){
        return name;
    }

    public void setProfile(BasePlantProfile basePlantProfile){
        Profile=basePlantProfile;
    }

   public void setName(String name){
        this.name=name;
   }
}