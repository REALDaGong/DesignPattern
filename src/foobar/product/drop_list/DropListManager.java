package foobar.product.drop_list;


import foobar.product.farm_product.*;
import foobar.product.product_interface.BaseProduct;

import java.util.*;

/**
 * 应用单例模式，享元模式
 * 注册并存储掉落列表
 */
public class DropListManager {

    /**
     * Default constructor
     */
    private DropListManager() {
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
        if(getDropListWithName(list.name)==null)
        {
            dropList.add(list);
        }
    }

    /**
     * @param name
     */
    public ProductDropList getDropListWithName(String name) {
        // TODO implement here
        for(ProductDropList i : dropList)
        {
            if(i.name==name)
            {
                return i;
            }
        }
        return null;
    }

    public ProductDropList generateDropList(String name){
        if(getDropListWithName(name)==null){
            ProductDropList productDropList=new ProductDropList();
            productDropList.name=name;
            BaseProduct baseProduct=null;
            if(name.equals("BattleMelon")){
                baseProduct=new BattleMelon();
            }
            else if(name.equals("AngleCotton")){
                baseProduct=new AngleCotton();
            }
            productDropList.addProduct(baseProduct,1);
            return productDropList;
        }
        else
            return getDropListWithName(name);
    }

    /**
     * @return
     */
    public static DropListManager getInstance() {
        // TODO implement here
        return instance;
    }

}