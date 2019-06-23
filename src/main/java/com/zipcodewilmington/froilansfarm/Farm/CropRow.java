package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Crop;

import java.util.Collection;

public class CropRow<Plant extends Crop> {
    private Collection<Plant> crops;
    private Boolean isFertilized;

    public void fertilize(){

    }

    public Collection<Plant> getCrops() {
        return crops;
    }

    public Boolean getFertilized() {
        return isFertilized;
    }
}
