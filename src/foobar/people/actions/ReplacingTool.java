package foobar.people.actions;

import foobar.tool.Tool;

public class ReplacingTool extends ActionWrapper {
    @Override
    public void act(Tool tool) {
        tool.replaceByNewOne();
    }
}
