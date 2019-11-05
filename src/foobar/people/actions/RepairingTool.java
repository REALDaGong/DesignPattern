package foobar.people.actions;

import foobar.tool.Tool;

public class RepairingTool extends ActionWrapper {
    @Override
    public void act(Tool tool) {
        tool.repair();
    }
}
