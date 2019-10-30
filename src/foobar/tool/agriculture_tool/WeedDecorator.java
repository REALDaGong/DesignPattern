package foobar.tool.agriculture_tool;
import foobar.plant.plant_entity.BasePlant;
import foobar.tool.Tool;
import foobar.Receiver;

public class WeedDecorator extends Tool {
    private WeedTool weedTool;

    public WeedDecorator(WeedTool weedTool){
        super();
        this.weedTool = weedTool; 
    }

    public WeedDecorator(){
        super();
        this.weedTool = new WeedTool();
    }

    @Override
    public void visit(Object basePlant){
        if(getState() == 0){
            System.out.println("This knife is damaged. Need to be repaired or replaced");
            return;
        }

        ((BasePlant)basePlant).pullWeed();
        System.out.println("Successful!");

        //operation by knife
        durability -= 1;
        setState();
    };

    @Override
    public WeedDecorator clone() {
        return new WeedDecorator();
    }
}