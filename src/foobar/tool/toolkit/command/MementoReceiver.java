package foobar.tool.toolkit.command;

public interface MementoReceiver {
    Memento createMemento();
    void reinstallMemento(Memento memento);
    void action();
}
