package foobar.tool.agriculture_tool;
import foobar.tool.Tool;

public class BaseDecorator extends Tool{
    public Tool tool;

    public BaseDecorator(WeedTool tool){
        super();
        this.tool = tool;
    }

    public BaseDecorator(){
        super();
        this.tool = new WeedTool();
    }

    @Override
    public void visit(Object basePlant){};

    @Override
    public BaseDecorator clone() {
        return new BaseDecorator();
    }
}
