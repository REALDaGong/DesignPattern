package foobar.animal.state;



/**
 * 
 */
public class FishState extends AnimalState {

    /**
     * Default constructor
     */
    public FishState() {
    	//this.animal=animal;
		state=young;
		nutritionalStatus=1;
    }

   
    public void eatAndGrowUp() {
    	state=state+1;
    	nutritionalStatus=1;
    	System.out.println("A fish has eaten and grown up!");
    	if(state==dead) {//成长阶段达到3，老死
			System.out.println("A fish has died of old age!");
		}
    	}
    public void justEat() {
    	nutritionalStatus++;
    	System.out.println("A fish has nothing to eat!");
    }
    public void getHungryAndDie() {
    	state=dead;
		System.out.println("A fish has starved to death!");
    }

    public void justGetHungry() {
    	nutritionalStatus--;
    	System.out.println("A fish has nothing to eat!");
    }


    /**
     * @return
     */
    public String produceWithoutDeath() {
        // TODO implement here
    	System.out.println("Fish does not have product without death!");
    	return null;
    }

    /**
     * @return
     */
    public String produceWithDeath() {
        // TODO implement here
    	System.out.println("A piece of fish has been produced!");
    	return "Fish";
    }

}