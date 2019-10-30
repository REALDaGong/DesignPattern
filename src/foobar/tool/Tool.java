package foobar.tool;

import foobar.Receiver;
import foobar.plant.plant_entity.BasePlant;

public abstract class Tool {
    protected int durability;
    protected int state;        //state

    public abstract Tool clone();

    public void setState(){ state = (durability > 0)? 1 : 0; }
    public int getState(){ return state; }

    public Tool(){
        durability = 100;
        setState();
    }

    public void repair(){
        durability += 15;
        setState();
        System.out.println("Repair completely!");
    };

    public Object replaceByNewOne(){ return clone(); }          //prototype

    public abstract void visit(Object obj);

}
