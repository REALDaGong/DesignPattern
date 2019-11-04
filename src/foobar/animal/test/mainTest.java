package foobar.animal.test;

import foobar.animal.animal.Chicken;
import foobar.animal.factory.ChickenFactory;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChickenFactory cf=new ChickenFactory();
		Chicken c=cf.createAnimal();
		c.walk();
		c.sleep();
		c.eat();
		c.eat();
		c.eat();
		c.produceWithoutDeath();
	}
}
