package foobar.plant.plant_profile;

import foobar.plant.period.Period;
import foobar.plant.period.Seed;
import foobar.product.drop_list.ProductDropList;
import foobar.product.farm_product.AngleCotton;
import foobar.product.farm_product.BattleMelon;
import foobar.product.farm_product.DemonCotton;
import foobar.product.product_interface.BaseProduct;
import javafx.util.Pair;

import java.util.*;

/**
 * 
 */
public class MelonProfile extends BasePlantProfile {

    @Override
    public String getName() {
        return "西瓜";
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
    public ProductDropList getDropList() {
        if(product==null) {
            product=new ProductDropList();
            product.add(new Pair<BaseProduct,Float>(new BattleMelon(),1.0f));
            product.add(new Pair<BaseProduct,Float>(new BattleMelon(),0.5f));
            product.add(new Pair<BaseProduct,Float>(new BattleMelon(),0.2f));
        }
        return product.clone();
    }

}