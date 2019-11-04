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
//type 好像没用?
    public PeriodType type;

    public String description;

    public Period getNextPeriod() {
        return nextPeriod;
    }

    public String getDescription() {
        return description;
    }

}
