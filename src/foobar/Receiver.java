package foobar;

import foobar.tool.Tool;

public interface Receiver {
    public Object accept(Tool tool);
}
