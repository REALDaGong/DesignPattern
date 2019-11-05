package foobar.people.actions;

import foobar.tool.Tool;

public class BuildingWork extends ActionWrapper {
    @Override
    public void act(Tool tool, Object obj) {
        tool.visit(obj);
    }
}