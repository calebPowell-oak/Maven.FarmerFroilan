package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;

public abstract class Crop<Food extends Edible> implements Produce {
    Food toYield;
    private Boolean isFertilized;
    private Boolean hasBeenHarvested;

    public Crop (Food toYield){
        isFertilized= false;
        hasBeenHarvested=false;
        this.toYield = toYield;
    }

    public void setFertilized(Boolean fertilized) {
        isFertilized = fertilized;
    }

    public Boolean getFertilized() {
        return isFertilized;
    }

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public Food yield(){
        if(isFertilized && !hasBeenHarvested) {
            hasBeenHarvested = true;
            return toYield;
        }
        return null;
    }
}
