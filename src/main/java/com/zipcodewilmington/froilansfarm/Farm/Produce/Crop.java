package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;

public abstract class Crop implements Produce {
    private Boolean isFertilized;
    private Boolean hasBeenHarvested;

    public Crop (){
        isFertilized= false;
        hasBeenHarvested=false;
    }
    public abstract Edible yield();


}
