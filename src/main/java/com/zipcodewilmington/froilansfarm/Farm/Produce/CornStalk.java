package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EarCorn;

public class CornStalk extends Crop {
    private Boolean isFertilized;
    private Boolean hasBeenHarvested;

    public CornStalk(){
        this.isFertilized=false;
        this.hasBeenHarvested=false;

    }
    public EarCorn yield() {
        if(isFertilized && !hasBeenHarvested)
        return new EarCorn();
        else return null;
    }
}
