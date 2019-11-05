package foobar.animal.animal_base;


import foobar.animal.action.SleepAction;
import foobar.animal.action.WalkAction;
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
    
    public boolean checkFertility() {
    	if(state.getNStatus()>1) {
    		return true;
    	}
    	else {
    		return false;
    	}
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

    /**��ʳ��Ӫ��+1
     * @return
     */
    public void eat() {
        //Ӫ��Ϊ3ʱ��ʳ���ɳ�
    	if(state.getNStatus()==3) {
    		state.eatAndGrowUp();
    	}
    	//Ӫ��+1
    	else {
    		state.justEat();
    	}
    	
    	//���¶���״̬
    	if(this.state.getNStatus()>1) {
    		this.isHungry=false;
    	}
    	if(state.getState()==3) {
    		this.isAlive=false;
    	}
    }

    /**������Ӫ��-1
     * @return
     */
    public void setHungry() {
        //Ӫ��Ϊ0ʱ����������
    	if(state.getNStatus()==0) {
    		state.getHungryAndDie();
    		this.isAlive=false;
    	}
    	//Ӫ��-1
    	else {
    		state.justGetHungry();
    	}
    	
    	//���¶���״̬
    	if(this.state.getNStatus()<2) {
    		this.isHungry=true;
    	}
    	if(state.getState()==3) {
    		this.isAlive=false;
    	}
    }

    /**�������ջ�
     * @return
     */
    public Object produceWithoutDeath() {
        //�ɳ��׶�Ϊ0�������ջ�
    	if(state.getState()==0) {
    		state.tooYoungToProduce();
    		return null;
    	}
    	else {
    		return state.produceWithoutDeath();
    	}
    }

    /**�����ջ�
     * @return
     */
    public Object produceWithDeath() {
    	this.isAlive=false;
    	return this.state.produceWithoutDeath();
    	
    }

}