package foobar.plant.period;

public class Seed extends Period{
    public Seed(){
        this.nextPeriod=new NotSeed();
        this.description="Seed";
    }
}
class NotSeed extends Period{
    public NotSeed(){
        this.nextPeriod=new GrowUp();
        this.description="Not seed";
    }
}
class GrowUp extends Period{
   public GrowUp(){
       this.description="Grown up";
    }
}