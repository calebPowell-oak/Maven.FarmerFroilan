package com.zipcodewilmington.froilansfarm.Farm.Produce;

public abstract class Crop implements Produce {
    private Boolean isFertilized;
    private Boolean hasBeenHarvested;

    public Crop (){
        isFertilized= false;
        hasBeenHarvested=false;
    }
}
