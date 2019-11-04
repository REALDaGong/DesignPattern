package foobar.plant.period;

/**
 * 植物的生长周期类
 */
public class Period {

    /**
     * Default constructor
     */
    public Period(){

    }

    public Period(Period nextPeriod) {
        this.nextPeriod=nextPeriod;
    }

    public Period nextPeriod=null;

    public PeriodType type;

    public String description;

    //获取下一阶段的对象
    public Period getNextPeriod() {
        return nextPeriod;
    }

    //获取当前阶段的描述
    public String getDescription() {
        return description;
    }

}
