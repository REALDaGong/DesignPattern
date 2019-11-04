package foobar.plant.plant_profile;

import foobar.plant.period.Period;
import foobar.plant.period.Seed;
import foobar.product.drop_list.ProductDropList;
import foobar.product.farm_product.AngleCotton;
import foobar.product.farm_product.DemonCotton;
import foobar.product.product_interface.BaseProduct;
import javafx.util.Pair;

import java.util.*;

/**
 * 
 */
public class CottonProfile extends BasePlantProfile {

    @Override
    public String getName() {
        return "棉花";
    }

    @Override
    public Period getFirstPeriod() {
        return new Seed();
    }

    @Override
    public int getThirsty() {
        return 100;
    }

    @Override
    public int getHealth() {
        return 100;
    }

    @Override
    //返回的是拷贝。
    public ProductDropList getDropList() {
        if(product==null) {
            product=new ProductDropList();
            product.add(new Pair<BaseProduct,Float>(new AngleCotton(),1.0f));
            product.add(new Pair<BaseProduct,Float>(new AngleCotton(),0.5f));
            product.add(new Pair<BaseProduct,Float>(new DemonCotton(),0.2f));
        }
        return product.clone();
    }


}