package foobar.animal.state;
import foobar.product.pasture_product.Pork;
import logger.logger;
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
    	logger.println("A pig has eaten and grown up!");
    	if(state==dead) {//�ɳ��׶δﵽ3������
			logger.println("A pig has died of old age!");
		}
    	}
    public void justEat() {
    	nutritionalStatus++;
    	logger.println("A pig is eating!");
    }
    public void getHungryAndDie() {
    	state=dead;
		logger.println("A pig has starved to death!");
    }

    public void justGetHungry() {
    	nutritionalStatus--;
    	logger.println("A pig has nothing to eat!");
    }

    /**
     * @return
     */
    public String produceWithoutDeath() {
        // TODO implement here
    	logger.println("Pig does not have product without death!");
    	return null;
    }

    /**
     * @return
     */
    public Pork produceWithDeath() {
        // TODO implement here
    	logger.println("A piece of pork has been produced!");
      	logger.println("A pig died!");
        return new Pork();
    }

   

}