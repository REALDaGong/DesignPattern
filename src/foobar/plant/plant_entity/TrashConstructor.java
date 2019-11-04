package foobar.plant.plant_entity;

import java.util.*;

/**
 * 
 */
public class TrashConstructor extends ConcretePrefixConstructor {

    /**
     * Default constructor
     */
    public TrashConstructor() {
    }

    @Override
    public void build1() {
        result.Prefix1="破败的";
    }

    @Override
    public void build2() {
        result.Prefix2="锈蚀";
    }

    @Override
    public void build3() {
        result.Prefix3="严重的";
    }

}