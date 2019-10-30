package foobar.plant.product.drop_list;

import java.util.*;

/**
 * 应用单例模式，享元模式
 * 注册并存储掉落列表
 */
public class DropListManager {

    /**
     * Default constructor
     */
    public DropListManager() {
    }

    /**
     * 
     */
    private Set<ProductDropList> dropList;

    /**
     * 
     */
    private static DropListManager instance;



    /**
     * @param list
     */
    public void registerDropList(ProductDropList list) {
        // TODO implement here
    }

    /**
     * @param name
     */
    public void getDropListWithName(String name) {
        // TODO implement here
    }

    /**
     * @return
     */
    public static DropListManager getInstance() {
        // TODO implement here
        return null;
    }

}