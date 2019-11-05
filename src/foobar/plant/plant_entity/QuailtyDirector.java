package foobar.plant.plant_entity;

import logger.logger;

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
        logger.println("得到构建的prefix结果");
        return builder.getResult();
    }

    /**
     * @param qC
     */
    public void setConstructor(QuailtyConstructor qC) {
        logger.println("构建者被指定，是"+qC);
        builder=qC;
    }

}