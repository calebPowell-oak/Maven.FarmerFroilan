package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Pomegranate;

public class PomegranateTree extends Crop {
    private Boolean isFertilized;
    private Boolean hasBeenHarvested;

    public PomegranateTree () {
        this.isFertilized=false;
        this.hasBeenHarvested=false;
    }

    public Pomegranate yield() {
        if(isFertilized && !hasBeenHarvested)
            return new Pomegranate();
        else return null;
    }
}
