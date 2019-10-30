package foobar.plant.plant_profile;

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
    public Set<BasePlantProfile> plantProfileList;

    /**
     * 
     */
    private static PlantProfileManager instance;




    /**
     * @param dropListName 
     * @param plantPrototype
     */
    public void genNewPlantProfile(String dropListName, BasePlantProfile plantPrototype) {
        // TODO implement here
    }

    /**
     * @param name
     */
    public void getPlantProfileWithName(String name) {
        // TODO implement here
    }

    /**
     * @return
     */
    public static PlantProfileManager getInstance() {
        // TODO implement here
        return null;
    }

}