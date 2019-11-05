package foobar.animal.state;
import foobar.product.pasture_product.Pork;

/**
 * 
 */
public class PigState extends AnimalState {

    /**
     * Default constructor
     */
    public PigState() {
    	//this.animal=animal;
		state=young;
		nutritionalStatus=1;
    }

   
    public void eatAndGrowUp() {
    	state=state+1;
    	nutritionalStatus=1;
    	System.out.println("A pig has eaten and grown up!");
    	if(state==dead) {//�ɳ��׶δﵽ3������
			System.out.println("A pig has died of old age!");
		}
    	}
    public void justEat() {
    	nutritionalStatus++;
    	System.out.println("A pig has nothing to eat!");
    }
    public void getHungryAndDie() {
    	state=dead;
		System.out.println("A pig has starved to death!");
    }

    public void justGetHungry() {
    	nutritionalStatus--;
    	System.out.println("A pig has nothing to eat!");
    }

    /**
     * @return
     */
    public String produceWithoutDeath() {
        // TODO implement here
    	System.out.println("Pig does not have product without death!");
    	return null;
    }

    /**
     * @return
     */
    public Pork produceWithDeath() {
        // TODO implement here
    	System.out.println("A piece of pork has been produced!");
      	System.out.println("A pig died!");
        return new Pork();
    }

   

}