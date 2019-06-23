package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Tomato;

public class TomatoPlant extends Crop {
//    private Boolean isFertilized;
//    private Boolean hasBeenHarvested;

    public TomatoPlant () {
        super();
//        this.isFertilized=false;
//        this.hasBeenHarvested=false;
    }

    public Tomato yield() {
        if( super.getFertilized() && !super.getHasBeenHarvested())

                    return new Tomato();

         return null;
    }
}
