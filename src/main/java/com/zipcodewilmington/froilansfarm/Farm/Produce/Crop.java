package com.zipcodewilmington.froilansfarm.Farm.Produce;

public abstract class Crop implements Produce {
    private Boolean isFertilized;
    private Boolean hasBeenHarvested;

    public Crop (){
        isFertilized= false;
        hasBeenHarvested=false;
    }

    public void setFertilized(Boolean fertilized) {
        isFertilized = fertilized;
    }

    public void setHasBeenHarvested(Boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }
}
