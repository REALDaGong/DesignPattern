package foobar.animal.state;

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
        System.out.println("A sheep has eaten and grown up!");
        if (state == dead) {//�ɳ��׶δﵽ3������
            System.out.println("A sheep has died of old age!");
        }
    }

    public void justEat() {
        nutritionalStatus++;
        System.out.println("A sheep has nothing to eat!");
    }

    public void getHungryAndDie() {
        state = dead;
        System.out.println("A sheep has starved to death!");
    }

    public void justGetHungry() {
        nutritionalStatus--;
        System.out.println("A sheep has nothing to eat!");
    }

    public void tooYoungToProduce() {
        System.out.println("This sheep is too young to lay an egg!");
    }

    /**
     * @return
     */
    public Wool produceWithoutDeath() {
        // TODO implement here
        System.out.println("A sheep has produced wool!");
        return new Wool();
    }

    /**
     * @return
     */
    public Mutton produceWithDeath() {
        // TODO implement here
        System.out.println("A piece of mutton has been produced!");
        System.out.println("A sheep died!");
        return new Mutton();
    }


}