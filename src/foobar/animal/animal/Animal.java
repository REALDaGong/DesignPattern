package foobar.animal.animal;


import foobar.animal.action.*;
import foobar.animal.color.Color;
import foobar.animal.state.AnimalState;

/**
 * 
 */
public class Animal {

    /**
     * Default constructor
     */
    public Animal(String type, Color color, WalkAction walkAction, SleepAction sleepAction, AnimalState state) {
    	this.type=type;
    	this.color=color;
    	this.walkAction=walkAction;
    	this.sleepAction=sleepAction;
    	this.state=state;
    	if(Math.random()<0.5) {
    		this.gender=0;
    	}
    	else {
    		this.gender=1;
    	}
    }

    /**
     * 
     */
    private boolean isAlive = true;

    /**
     * 
     */
    private boolean isHungry = false;
 
    /**
     * 
     */
    private String type;
    
    private int gender;

    /**
     * 
     */
    private WalkAction walkAction;

    /**
     * 
     */
    private SleepAction sleepAction;

    /**
     * 
     */
    private Color color;

    /**
     * 
     */
    private AnimalState state;
    
    public int getGender() {
    	return gender;
    }
    public boolean checkFertility() {
    	if(state.getNStatus()>1) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public String breed(Animal target) {
    	this.state.setNStatus(1);
    	target.state.setNStatus(1);    	
    	return this.type;
    }
    	
    

    
    /**
     * @return
     */
    public boolean getLife() {
        // TODO implement here
    	
        return isAlive;
    }

    /**
     * @return
     */
    public boolean getHungry() {
        // TODO implement here
        return isHungry;
    }

    /**
     * @return
     */
    public String getType() {
        // TODO implement here
        return type;
    }

    /**
     * @return
     */
    public void sleep() {
        // TODO implement here
    	sleepAction.runAction(this);
    }

    /**
     * @return
     */
    public void walk() {
        // TODO implement here
    	walkAction.runAction(this);
    }

    /**
     * @return
     */
    public String getColor() {
        // TODO implement here
        return color.getColor();
    }

    /**
     * @param color 
     * @return
     */
    public void setColor(Color color) {
        // TODO implement here
    	this.color=color;
    }

    /**进食，营养+1
     * @return
     */
    public void eat() {
        //营养为3时进食，成长
    	if(state.getNStatus()==3) {
    		state.eatAndGrowUp();
    	}
    	//营养+1
    	else {
    		state.justEat();
    	}
    	
    	//更新动物状态
    	if(this.state.getNStatus()>1) {
    		this.isHungry=false;
    	}
    	if(state.getState()==3) {
    		this.isAlive=false;
    	}
    }

    /**挨饿，营养-1
     * @return
     */
    public void setHungry() {
        //
    	if(state.getNStatus()==0) {
    		state.getHungryAndDie();
    		this.isAlive=false;
    	}
    	//
    	else {
    		state.justGetHungry();
    	}
    	
    	//
    	if(this.state.getNStatus()<2) {
    		this.isHungry=true;
    	}
    	if(state.getState()==3) {
    		this.isAlive=false;
    	}
    }

    /**非屠宰收获
     * @return
     */
    public String produceWithoutDeath() {
        //
    	if(state.getState()==0) {
    		state.tooYoungToProduce();
    		return null;
    	}
    	else {
    		return state.produceWithoutDeath();
    	}
    }

    /**屠宰收获
     * @return
     */
    public String produceWithDeath() {
    	this.isAlive=false;
    	return this.state.produceWithoutDeath();
    	
    }

}