package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CropRow<Plant extends Crop> {
    private List<Plant> crops = new ArrayList<>();
    private Boolean isFertilized;

    public void fertilize(){
        for(Plant plant : crops){
            plant.setFertilized(true);
        }
        isFertilized = true;
    }

    public List<Plant> getCrops() {
        return crops;
    }

    public Boolean getFertilized() {
        return isFertilized;
    }

    public Collection<Edible> harvestCrops() {
        Collection<Edible> stash = new ArrayList<>();
        for(Crop crop: crops)
            stash.add(crop.yield());

        return stash;
    }
}
