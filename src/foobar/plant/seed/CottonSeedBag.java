package foobar.plant.seed;

import java.util.*;

import foobar.plant.plant_entity.*;
import foobar.plant.plant_profile.BasePlantProfile;
import foobar.plant.plant_profile.PlantProfileManager;

/**
 * 
 */
public class CottonSeedBag extends SeedBag {

    @Override
    public BasePlantProfile getProfile() {
        return PlantProfileManager.getInstance().getPlantProfile("Cotton");
    }
    @Override
    public void setPrefix(Prefix prefix){
        this.prefix=prefix;
    }
}