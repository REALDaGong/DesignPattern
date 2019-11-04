package foobar.animal.state;


import foobar.animal.animal.Animal;

/**
 * 
 */
public class AnimalState {
	/*
	enum State{
		young,middleAge,oldAge,dead;
	}*/

	public static final int young = 0;
	public static final int middleAge = 1;
	public static final int oldAge = 2;
	public static final int dead = 3;
	
	
    /**
     * Default constructor
     */
    public AnimalState() {
    }

    /**
     * 
     */
    protected int state;

    /**
     * 
     */
    protected int nutritionalStatus;

    /**
     * 
     */
    protected Animal animal;

    /**
     * @return
     */
    public int getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(int state) {
    	this.state=state;
    }

    /**
     * @return
     */
    public int getNStatus() {
        return nutritionalStatus;
    }

    /**
     * @param nStatus
     */
    public void setNStatus(int nStatus) {
    	nutritionalStatus=nStatus;
    }

    /**
     * @return
     */
    public void eat() {
        // TODO implement here
       
    }
    
    public void eatAndGrowUp() {
    	
    }

    public void justEat() {
    	
    }
    
    public void getHungryAndDie() {
    	
    }
    
    public void justGetHungry() {
    	
    }
    /**
     * @return
     */
    public void setHungry() {
        // TODO implement here
       
    }
    public void tooYoungToProduce() {
    	
    }

    /**
     * @return
     */
    public String produceWithoutDeath() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String produceWithDeath() {
        // TODO implement here
        return null;
    }

}