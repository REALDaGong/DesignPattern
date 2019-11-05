package foobar.people.actions;

import foobar.tool.Tool;

// 农场工人行为的接口
public interface Action {
    public void act(Tool tool, Object obj);
    public void act(Tool tool);
}
