package foobar.animal.state;

import foobar.product.pasture_product.FishMeat;
import logger.logger;

public class FishState extends AnimalState {

    /**
     * Default constructor
     */
    public FishState() {
        //this.animal=animal;
        state = young;
        nutritionalStatus = 1;
    }


    public void eatAndGrowUp() {
        state = state + 1;
        nutritionalStatus = 1;
        logger.println("A fish has eaten and grown up!");
        if (state == dead) {//?????��?3??????
            logger.println("A fish has died of old age!");
        }
    }

    public void justEat() {
        nutritionalStatus++;
        logger.println("A fish is eating!");
    }

    public void getHungryAndDie() {
        state = dead;
        logger.println("A fish has starved to death!");
    }

    public void justGetHungry() {
        nutritionalStatus--;
        logger.println("A fish has nothing to eat!");
    }


    /**
     * @return
     */
    public String produceWithoutDeath() {
        // TODO implement here
        logger.println("Fish does not have product without death!");
        return null;
    }

    /**
     * @return
     */
    public FishMeat produceWithDeath() {
        // TODO implement here
        logger.println("A piece of fish has been produced!");
        logger.println("A fish died!");
        return new FishMeat();
    }

}