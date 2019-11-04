package foobar.tool;

public abstract class Tool {
    protected int durability;   //工具的耐久度
    protected int state;        //工具的状态：1为可用，0为不可用      state模式

    public abstract Tool clone();       //template模式

    public void setState(){ state = (durability > 0)? 1 : 0; }
    public int getState(){ return state; }

    public Tool(){              //每次修改耐久度时需根据耐久度重新计算工具状态
        durability = 100;
        setState();
    }

    public void repair(){       //维修工具：耐久度+15
        durability += 15;
        setState();
        System.out.println("Repair completely!");
    };

    public Object replaceByNewOne(){ return clone(); }          //prototype模式

    public abstract void visit(Object obj);            //与植物/建筑交互的统一接口

}
