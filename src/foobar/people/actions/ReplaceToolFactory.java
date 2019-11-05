package foobar.people.actions;

public class ReplaceToolFactory implements Provider {
    @Override
    public ActionWrapper produce() {
        return new ReplacingTool();
    }
}