package foobar.plant.seed;

import java.util.*;

import foobar.plant.farm.Tile;
import foobar.plant.plant_entity.*;
import foobar.plant.plant_profile.BasePlantProfile;
import foobar.plant.plant_profile.PlantProfileManager;

/**
 * 
 */
public class MelonSeedBag extends SeedBag {
    public BasePlantProfile getProfile() {
        return PlantProfileManager.getInstance().getPlantProfile("Melon");
    }
    @Override
    public void setPrefix(Prefix prefix){
        this.prefix=prefix;
    }

}