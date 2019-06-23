package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Guava;

public class GuavaTree extends Crop {
    private Boolean isFertilized;
    private Boolean hasBeenHarvested;

    public GuavaTree () {
        this.isFertilized=false;
        this.hasBeenHarvested=false;
    }

    public Guava yield() {
        if(isFertilized && !hasBeenHarvested)
            return new Guava();
        else return null;
    }


}
