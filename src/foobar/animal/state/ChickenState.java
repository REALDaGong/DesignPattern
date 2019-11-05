package foobar.animal.state;

import foobar.product.pasture_product.ChickenMeat;
import foobar.product.pasture_product.Egg;
import logger.logger;
/**
 * 
 */
public class ChickenState extends AnimalState {

    /**
     * Default constructor
     */
    public ChickenState() {
    	//this.animal=animal;
		state=young;
		nutritionalStatus=1;
    }

   
    public void eatAndGrowUp() {
    	state=state+1;
    	nutritionalStatus=1;
    	logger.println("A chicken has eaten and grown up!");
    	if(state==dead) {//�ɳ��׶δﵽ3������
			logger.println("A chicken has died of old age!");
		}
    	}
    public void justEat() {
    	nutritionalStatus++;
    	logger.println("A chicken is eating!");
    }
   
    public void getHungryAndDie() {
    	state=dead;
		logger.println("A chicken has starved to death!");
    }

    public void justGetHungry() {
    	nutritionalStatus--;
    	logger.println("A chicken has nothing to eat!");
    }
    
    public void tooYoungToProduce() {
    	logger.println("This chicken is too young to lay an egg!");
    }
    
    /**
     * @return
     */
    public Egg produceWithoutDeath() {    	
				//��������	
    	logger.println("A chicken has laid an egg!");
    	return new Egg();
		     
    }

    /**
     * @return
     */
    public ChickenMeat produceWithDeath() {
        // TODO implement here
    	
			//��������		
    	logger.println("A piece of chicken has been produced!");
    	logger.println("A chicken died!");
		return new ChickenMeat();
    }

   
}