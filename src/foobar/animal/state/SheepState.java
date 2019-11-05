package foobar.animal.state;
import logger.logger;
import foobar.product.pasture_product.Mutton;
import foobar.product.pasture_product.Wool;

/**
 *
 */
public class SheepState extends AnimalState {

    /**
     * Default constructor
     */
    public SheepState() {
        //this.animal=animal;
        state = young;
        nutritionalStatus = 1;
    }


    public void eatAndGrowUp() {
        state = state + 1;
        nutritionalStatus = 1;
        logger.println("A sheep has eaten and grown up!");
        if (state == dead) {//�ɳ��׶δﵽ3������
            logger.println("A sheep has died of old age!");
        }
    }

    public void justEat() {
        nutritionalStatus++;
        logger.println("A sheep is eating!");
    }

    public void getHungryAndDie() {
        state = dead;
        logger.println("A sheep has starved to death!");
    }

    public void justGetHungry() {
        nutritionalStatus--;
        logger.println("A sheep has nothing to eat!");
    }

    public void tooYoungToProduce() {
        logger.println("This sheep is too young to produce wool!");
    }

    /**
     * @return
     */
    public Wool produceWithoutDeath() {
        // TODO implement here
        logger.println("A sheep has produced wool!");
        return new Wool();
    }

    /**
     * @return
     */
    public Mutton produceWithDeath() {
        // TODO implement here
        logger.println("A piece of mutton has been produced!");
        logger.println("A sheep died!");
        return new Mutton();
    }


}