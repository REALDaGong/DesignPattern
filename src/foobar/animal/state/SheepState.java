package foobar.animal.state;


/**
 * 
 */
public class SheepState extends AnimalState {

    /**
     * Default constructor
     */
    public SheepState() {
    	//this.animal=animal;
		state=young;
		nutritionalStatus=1;
    }

  
    public void eatAndGrowUp() {
    	state=state+1;
    	nutritionalStatus=1;
    	System.out.println("A sheep has eaten and grown up!");
    	if(state==dead) {//成长阶段达到3，老死
			System.out.println("A sheep has died of old age!");
		}
    	}
    public void justEat() {
    	nutritionalStatus++;
    	System.out.println("A sheep has nothing to eat!");
    }
    public void getHungryAndDie() {
    	state=dead;
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
    public String produceWithoutDeath() {
        // TODO implement here
    	System.out.println("A sheep has produced wool!");
        return "wool";
    }

    /**
     * @return
     */
    public String produceWithDeath() {
        // TODO implement here
    	System.out.println("A piece of mutton has been produced!");
        return "Mutton";
    }

   

}