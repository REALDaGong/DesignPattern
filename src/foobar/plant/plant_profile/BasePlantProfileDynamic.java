package foobar.plant.plant_profile;

import foobar.plant.period.Period;
import foobar.plant.period.Seed;
import foobar.product.drop_list.ProductDropList;
/**
 * Manager动态生成植物基本属性时使用这个类，自己实例这个是没有用的，只要你不改Manager里的代码。
 */
public final class BasePlantProfileDynamic extends BasePlantProfile {
    private String name;
    private Period period;
    private int thirsty;
    private int health;
    private ProductDropList dropList;
    public BasePlantProfileDynamic(String name, int health, int thirsty, ProductDropList list){
        this.name=name;
        this.health=health;
        this.thirsty=thirsty;
        this.dropList=list;
        this.period=new Seed();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Period getFirstPeriod() {
        return new Seed();
    }

    @Override
    public int getThirsty() {
        return thirsty;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public ProductDropList getDropList() {
        return dropList.clone();
    }
}
