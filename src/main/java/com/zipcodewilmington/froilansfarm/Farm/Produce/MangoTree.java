package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Mango;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Tomato;

public class MangoTree extends Crop {
    private Boolean isFertilized;
    private Boolean hasBeenHarvested;

    public MangoTree () {
        this.isFertilized=false;
        this.hasBeenHarvested=false;
    }


    public Mango yield(){
        if(isFertilized && !hasBeenHarvested)
        return new Mango();
        else return null;
    }
}
