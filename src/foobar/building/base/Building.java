package foobar.building.base;

public abstract class Building {
    public String name;
    public double xlen;
    public double ylen;
    public double zlen;
    public double capacity;

//    public ArrayList<Object> stored;

    public Building() {

    }

    abstract public void show();
}
