package foobar.plant.plant_entity;

import java.util.*;

/**
 * 建造者模式
 */
public class QuailtyDirector {

    /**
     * 指定的建造者
     */
    private QuailtyConstructor builder;


    /**
     * @return
     */
    public Prefix construct() {
        // TODO implement here
        builder.build1();
        builder.build2();
        builder.build3();
        return builder.getResult();
    }

    /**
     * @param qC
     */
    public void setConstructor(QuailtyConstructor qC) {
        builder=qC;
    }

}