package foobar.building.building_test;

import foobar.building.BuildingDirector;
import foobar.building.Farm;
import foobar.building.Pasture;
import foobar.building.StoreHouse;
import foobar.building.builder.FarmBuilder;
import foobar.building.builder.PastureBuilder;
import foobar.building.builder.StoreHouseBuilder;

public class BuildingTest {
    public static void main() {
        System.out.println("------------Builder Pattern------------");

        BuildingDirector director = new BuildingDirector();
        FarmBuilder farmBuilder = new FarmBuilder("myfarm", 1, 1, 1);
        PastureBuilder pastureBuilder = new PastureBuilder("mypasture", 1, 1, 1);
        StoreHouseBuilder storeHouseBuilder = new StoreHouseBuilder("mystorehouse", 1, 1, 1);

        director.Build(farmBuilder);
        Farm farm = (Farm) farmBuilder.GetBuilding();
        director.Build(pastureBuilder);
        Pasture pasture = (Pasture) pastureBuilder.GetBuilding();
        director.Build(storeHouseBuilder);
        StoreHouse storeHouse = (StoreHouse) storeHouseBuilder.GetBuilding();

        System.out.println("------------Builder Pattern------------\n\n\n");


        System.out.println("-------------Facade Pattern-------------");
        System.out.println("Let's add some animal to my pasture");
        pasture.addAnimal("Chicken");
        pasture.addAnimal("Frog");
        pasture.addAnimal("Fish");
        pasture.addAnimal("Sheep");
        pasture.addAnimal("Pig");
        pasture.eat();
        pasture.eat();
        pasture.eat();
        pasture.eat();
        pasture.breed();
        pasture.show();

        System.out.println("Let's produce with death in pasture");
        pasture.produceWithoutDeath().forEach(i->storeHouse.addAnimal(i));
        pasture.produceWithDeath().forEach(i->storeHouse.addAnimal(i));
        storeHouse.show();
        System.out.println("-------------Facade Pattern-------------");
    }


}
