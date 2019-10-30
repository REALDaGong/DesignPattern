package foobar.Building;

import foobar.Building.Abstract.BuildingBuilder;

public class BuildingDirector {
    public void Build(BuildingBuilder buildingBuilder)
    {
        buildingBuilder.Prepare();
        buildingBuilder.SetCapacity();
    }
}
