package foobar.plant.plant_entity;

import java.util.*;

/**
 * 建造者模式
 */
public abstract class ConcretePrefixConstructor implements QuailtyConstructor {

    /**
     * Default constructor
     */
    public ConcretePrefixConstructor() {
    }

    /**
     * 
     */
    protected Prefix result;

    /**
     * 
     */
    public abstract void build1();

    /**
     * 
     */
    public abstract void build2();

    /**
     * 
     */
    public abstract void build3();

    /**
     * 
     */
    public Prefix getResult() {
        return result;
    }

}