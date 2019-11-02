package foobar.plant.consumable.effect;

import foobar.plant.consumable.item.JinF;
import foobar.plant.consumable.item.JinP;
import foobar.plant.consumable.item.ShiF;
import foobar.plant.consumable.item.ShiP;

public class FPMediator implements FMediator {

    private ShiF shiF;
    private ShiP shiP;
    private JinP jinP;
    private JinF jinF;


    @Override
    //初始化中介者
    public void createMediator() {
        shiF=new ShiF();
        shiP=new ShiP();
        jinF=new JinF();
        jinP=new JinP();
        shiF.setMediator(this);
        shiP.setMediator(this);
        jinF.setMediator(this);
        jinP.setMediator(this);
    }

    @Override
    //所有药剂发挥作用
    public void actAll() {
        shiF.act();
        shiP.act();
        jinP.act();
        jinF.act();
    }
}
