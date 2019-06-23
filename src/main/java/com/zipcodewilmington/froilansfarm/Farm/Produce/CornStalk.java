package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EarCorn;

public class CornStalk extends Crop {
//    private Boolean isFertilized;
//    private Boolean hasBeenHarvested;

    public CornStalk(){
        super();
//        this.isFertilized=false;
//        this.hasBeenHarvested=false;

    }
    public EarCorn yield() {
        if( super.getFertilized() && !super.getHasBeenHarvested())
            return new EarCorn();
       return null;
    }
}
