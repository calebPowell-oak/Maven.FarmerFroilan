package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Guava;

public class GuavaTree extends Crop {

    public GuavaTree () {
        super();
    }

    public Guava yield() {
        if(super.getFertilized() && !super.getHasBeenHarvested())
            return new Guava();
        else return null;
    }


}
