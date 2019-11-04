package foobar.plant.period;

public class Seed extends Period{
    public Seed(){
        this.nextPeriod=new NotSeed();
    }
}
class NotSeed extends Period{
    public NotSeed(){
        this.nextPeriod=new GrowUp();
    }
}
class GrowUp extends Period{

}