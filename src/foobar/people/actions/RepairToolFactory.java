package foobar.people.actions;

public class RepairToolFactory implements Provider {
    @Override
    public ActionWrapper produce() {
        return new RepairingTool();
    }
}
