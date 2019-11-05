package foobar.animal.state;
import foobar.product.pasture_product.FrogMeat;
import logger.logger;
/**
 * 
 */
public class FrogState extends AnimalState {

    /**
     * Default constructor
     */
    public FrogState() {
    	//this.animal=animal;
		state=young;
		nutritionalStatus=1;
    }

    
    public void eatAndGrowUp() {
    	state=state+1;
    	nutritionalStatus=1;
    	logger.println("A frog has eaten and grown up!");
    	if(state==dead) {//?????��?3??????
			logger.println("A frog has died of old age!");
		}
    	}
    public void justEat() {
    	nutritionalStatus++;
    	logger.println("A frog is eating!");
    }
    public void getHungryAndDie() {
    	state=dead;
		logger.println("A frog has starved to death!");
    }

    public void justGetHungry() {
    	nutritionalStatus--;
    	logger.println("A frog has nothing to eat!");
    }

    /**
     * @return
     */
    public String produceWithoutDeath() {
        // TODO implement here
    	logger.println("Frog does not have product without death!");
    	return null;
    }

    /**
     * @return
     */
    public FrogMeat produceWithDeath() {
        // TODO implement here
    	logger.println("A piece of frog meat has been produced!");
      	logger.println("A frog died!");
        return new FrogMeat();
    }

}