package foobar.people.actions;

import foobar.tool.Tool;

public class AgricultureWork extends ActionWrapper {
    @Override
    public void act(Tool tool, Object obj) {
        tool.visit(obj);
    }
}