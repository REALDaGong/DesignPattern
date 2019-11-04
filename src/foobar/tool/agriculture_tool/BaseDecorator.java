package foobar.tool.agriculture_tool;
import foobar.tool.Tool;

public class BaseDecorator extends Tool{
    private WeedTool weedTool;

    public BaseDecorator(WeedTool weedTool){
        super();
        this.weedTool = weedTool;
    }

    public BaseDecorator(){
        super();
        this.weedTool = new WeedTool();
    }

    @Override
    public void visit(Object basePlant){
        weedTool.visit(basePlant);
    };

    @Override
    public BaseDecorator clone() {
        return new BaseDecorator();
    }
}
