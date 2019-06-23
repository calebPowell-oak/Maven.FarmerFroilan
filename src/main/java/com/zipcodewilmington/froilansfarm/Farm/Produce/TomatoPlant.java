package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Tomato;

public class TomatoPlant extends Crop {
    private Boolean isFertilized;
    private Boolean hasBeenHarvested;

    public TomatoPlant () {
        this.isFertilized=false;
        this.hasBeenHarvested=false;
    }

    public Tomato yield() {
        if((isFertilized )&& (!hasBeenHarvested))
            return new Tomato();
        else return null;
    }
}
