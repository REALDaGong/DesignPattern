package foobar.people.actions;

public class AgricultureWorkFactory implements Provider{
    @Override
    public ActionWrapper produce() {
        return new AgricultureWork();
    }
}
