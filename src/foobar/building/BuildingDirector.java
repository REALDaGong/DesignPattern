package foobar.building;

import foobar.building.building_abstract.BuildingBuilder;

public class BuildingDirector {
    public void Build(BuildingBuilder buildingBuilder)
    {
        buildingBuilder.Prepare();
        buildingBuilder.SetCapacity();
    }
}
