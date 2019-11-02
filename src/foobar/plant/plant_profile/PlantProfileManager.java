package foobar.plant.plant_profile;

import foobar.product.drop_list.DropListManager;

import java.util.*;

/**
 * 应用单例模式，享元模式
 * 生产，注册并存储植物的基本信息
 */
public class PlantProfileManager {

    /**
     * Default constructor
     */
    public PlantProfileManager() {
    }

    /**
     * 
     */
    public ArrayList<BasePlantProfile> plantProfileList=new ArrayList<BasePlantProfile>();

    /**
     * 
     */
    private static PlantProfileManager instance;




    /**
     * @param dropListName 
     * @param plantPrototype
     */
    public void addPlantProfile(String dropListName, BasePlantProfile plantPrototype) {
        // TODO implement here
        if(getPlantProfileWithName(dropListName)==null){
            plantProfileList.add(plantPrototype);
        }
    }

    //产生新的产品属性
    public BasePlantProfile generatePlantProfile(String dropListName){
        BasePlantProfile basePlantProfile=null;
        if(dropListName.equals("Melon")){
            basePlantProfile=new MelonProfile();
        }
        else if(dropListName.equals("Cotton")){
            basePlantProfile=new CottonProfile();
        }
        basePlantProfile.setName(dropListName);
        if(DropListManager.getInstance().getDropListWithName(dropListName)!=null) {
            basePlantProfile.addDropList(DropListManager.getInstance().getDropListWithName(dropListName));
        }
        else{
            basePlantProfile.addDropList(DropListManager.getInstance().generateDropList(dropListName));
        }
        return basePlantProfile;
    }

    /**
     * @param name
     * @return
     */
    public BasePlantProfile getPlantProfileWithName(String name) {
        // TODO implement here
        for(BasePlantProfile i : plantProfileList){
            if(i.getName()==name)
                return i;
        }
        return null;
    }

    /**
     * @return
     */
    public static PlantProfileManager getInstance() {
        // TODO implement here
        return instance;
    }

}