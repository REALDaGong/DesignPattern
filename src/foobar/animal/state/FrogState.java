package foobar.animal.state;

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
    	System.out.println("A frog has eaten and grown up!");
    	if(state==dead) {//成长阶段达到3，老死
			System.out.println("A frog has died of old age!");
		}
    	}
    public void justEat() {
    	nutritionalStatus++;
    	System.out.println("A frog has nothing to eat!");
    }
    public void getHungryAndDie() {
    	state=dead;
		System.out.println("A frog has starved to death!");
    }

    public void justGetHungry() {
    	nutritionalStatus--;
    	System.out.println("A frog has nothing to eat!");
    }

    /**
     * @return
     */
    public String produceWithoutDeath() {
        // TODO implement here
    	System.out.println("Frog does not have product without death!");
    	return null;
    }

    /**
     * @return
     */
    public String produceWithDeath() {
        // TODO implement here
    	System.out.println("A piece of frog meat has been produced!");
        return "FrogMeat";
    }

}