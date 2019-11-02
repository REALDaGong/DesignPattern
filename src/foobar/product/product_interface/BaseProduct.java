package foobar.product.product_interface;


public abstract class BaseProduct {
    String NAME;
    String Description;
    int Value;
    public abstract String getname();
    public abstract void timeLost();
    public abstract void remove();
}