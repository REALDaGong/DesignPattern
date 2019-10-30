package foobar.Building.Abstract;

import java.util.ArrayList;

public abstract class Building {
    public String name;
    public double xlen;
    public double ylen;
    public double zlen;
    public double capacity;

    public ArrayList<Object> stored;

    public Building(){
        stored = new ArrayList<>();
    }

    abstract public boolean Add(Object object);

    abstract public boolean Remove(Object object);
}
