package foobar.product.drop_list;

import java.util.*;

import foobar.plant.plant_profile.*;
import foobar.product.product_interface.BaseProduct;
import javafx.util.Pair;

/**
 * 产品列表的基类，可以让一种植物有多种产品
 */
public class ProductDropList implements ProductIterable, Implementor {

    /**
     * Default constructor
     */
    public ProductDropList() {

    }

    /**
     * TODO:补充定义
     */
    private ArrayList<Pair<BaseProduct,Float>> productList=new ArrayList<Pair<BaseProduct,Float>>();

    /**
     * 
     */
    public String name;

    /**
     * @return
     */
    public ProductDropListIterator getIterator() {
        // TODO implement here
        return new ProductDropListIterator(this);
    }

    /**
     * @param result 
     * @param chance
     */
    public void addProduct(BaseProduct result, float chance) {
        // TODO implement here
        productList.add(new Pair<BaseProduct,Float>(result,chance));
    }

    /**
     * @param index
     */
    public void removeProduct(int index) {
        // TODO implement here
        productList.remove(index);
    }

    //获得列表第几个
    public Pair<BaseProduct,Float> get(int index)
    {
        return productList.get(index);
    }

    //返回列表的大小
    public int  size(){
        return productList.size();
    }

    /**
     * @return
     */
    public ArrayList<BaseProduct> getDrop() {
        // TODO implement here
        ArrayList<BaseProduct> list=new ArrayList<BaseProduct>();
        for (Pair<BaseProduct,Float> productFloatPair:productList) {
            if(Math.random()<productFloatPair.getValue()){
                list.add(productFloatPair.getKey());
            }
        }
        return list;
    }

    /**
     * @param obj
     */
    public void add(Pair<BaseProduct, Float> obj) {
        // TODO implement here
        productList.add(obj);
    }

    /**
     * @param obj
     */
    public void remove(Pair<BaseProduct, Float> obj) {
        // TODO implement here
        productList.remove(obj);
    }
    public ProductDropList clone(){
        ProductDropList returnValue=new ProductDropList();
        for (Pair<BaseProduct,Float> i:productList) {
            returnValue.add(i);
        }
        return returnValue;
    }
}