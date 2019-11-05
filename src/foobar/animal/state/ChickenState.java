package foobar.animal.state;

import foobar.product.pasture_product.ChickenMeat;
import foobar.product.pasture_product.Egg;

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
    	System.out.println("A chicken has eaten and grown up!");
    	if(state==dead) {//�ɳ��׶δﵽ3������
			System.out.println("A chicken has died of old age!");
		}
    	}
    public void justEat() {
    	nutritionalStatus++;
    	System.out.println("A chicken is eating!");
    }
   
    public void getHungryAndDie() {
    	state=dead;
		System.out.println("A chicken has starved to death!");
    }

    public void justGetHungry() {
    	nutritionalStatus--;
    	System.out.println("A chicken has nothing to eat!");
    }
    
    public void tooYoungToProduce() {
    	System.out.println("This chicken is too young to lay an egg!");
    }
    
    /**
     * @return
     */
    public Egg produceWithoutDeath() {    	
				//��������	
    	System.out.println("A chicken has laid an egg!");
    	return new Egg();
		     
    }

    /**
     * @return
     */
    public ChickenMeat produceWithDeath() {
        // TODO implement here
    	
			//��������		
    	System.out.println("A piece of chicken has been produced!");
    	System.out.println("A chicken died!");
		return new ChickenMeat();
    }

   
}