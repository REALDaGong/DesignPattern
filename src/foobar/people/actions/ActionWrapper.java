package foobar.people.actions;

import foobar.tool.Tool;

public abstract class ActionWrapper implements Action{
    @Override
    public void act(Tool tool, Object obj) {}
    @Override
    public void act(Tool tool) {}
}
