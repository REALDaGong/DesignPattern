package foobar.plant.plant_profile;

import logger.logger;
import foobar.product.drop_list.ProductDropList;

import java.util.*;

/**
 * 应用单例模式，享元模式
 * 生产，注册并存储植物的基本信息
 */
public class PlantProfileManager {

    /**
     * Default constructor
     */
    private PlantProfileManager() {
        ProfileMap.clear();
    }

    public Object readResolve() {
        return instance;
    }
    /**
     * 
     */
    private static HashMap<String,BasePlantProfile> ProfileMap=new HashMap<String, BasePlantProfile>();
    /**
     * 
     */
    private static PlantProfileManager instance=new PlantProfileManager();

    //能写成这样真是笑死我了
    //搞成这个样子是为了防止享元跑到工厂外边去。
    //产生新的产品属性


    public BasePlantProfile getPlantProfile(String name){
        //首先，查询是否已经有实例
        if(ProfileMap.containsKey(name)){
            return ProfileMap.get(name);
        }
        //没有就首先通过反射获取类的实例，要求都在规定的包目录(这里)下，而且命名正确。

        //得到包名

        Package pack= instance.getClass().getPackage();
        logger.println("尝试寻找这个类："+pack.getName()+"."+name+"Profile");
        //搞
        try{
            Class profile=Class.forName(pack.getName()+"."+name+"Profile");
            BasePlantProfile result=(BasePlantProfile) profile.getDeclaredConstructor().newInstance();
            ProfileMap.put(name, result);
            return result;
        } catch (Exception e) {
            logger.println(e.getMessage());

        }

        //没有就算了
        logger.println("找不到" + name + "的基础属性，请检查应有的输入格式");
        return null;

    }
    //如果真的想动态添加的话。
    //手动添加的和字节码存在的会发生冲突，先实例化的会被留下。
    /**
     * @return true=success.
     */
    public boolean addPlantProfile(String name, int health, int thirsty, ProductDropList list){
        logger.println("加入类:"+name);
        if(ProfileMap.containsKey(name)){
            return false;
        }
        ProfileMap.put(name,new BasePlantProfileDynamic(name,health,thirsty,list));
        return true;
    }
    /**
     * 单例
     */
    public static PlantProfileManager getInstance() {
        return instance;
    }

}