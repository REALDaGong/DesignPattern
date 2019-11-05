package foobar.people.actions;

public class BuildingWorkFactory implements Provider {
    @Override
    public ActionWrapper produce() {
        return new BuildingWork();
    }
}
