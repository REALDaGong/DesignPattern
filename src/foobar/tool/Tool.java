package foobar.tool;

import foobar.plant.plant_entity.BasePlant;

public abstract class Tool {
    protected int durability;   //耐久度
    protected int state;        //可用情况 state

    public abstract Tool clone();

    public void setState(){ state = (durability > 0)? 1 : 0; }
    public int getState(){ return state; }

    public Tool(){
        durability = 100;
        setState();
    }

    public void repair(){               //修补工具
        durability += 15;
        setState();
        System.out.println("Repair completely!");
    };

    public Object replaceByNewOne(){ return clone(); }          //更换工具  prototype

    public abstract void visit(Object obj);

}
