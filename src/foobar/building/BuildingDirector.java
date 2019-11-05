package foobar.building;

import foobar.building.base.BuildingBuilder;

public class BuildingDirector {
    public void Build(BuildingBuilder buildingBuilder)
    {
        buildingBuilder.prepare();
        buildingBuilder.building();
    }
}
