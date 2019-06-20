package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;

public class Chicken implements Produce {
    private Boolean isFertilized;

    public Edible yield(){
        return new EdibleEgg();
    }
}
