package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Pomegranate;

public class PomegranateTree extends Crop {
//    private Boolean isFertilized;
//    private Boolean hasBeenHarvested;

    public PomegranateTree () {
        super();
//        this.isFertilized=false;
//        this.hasBeenHarvested=false;
    }

    public Pomegranate yield() {
        if( super.getFertilized() && !super.getHasBeenHarvested())

            return new Pomegranate();
        return null;
    }
}
