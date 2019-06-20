package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;

public class TomatoPlant extends Crop {

    public Edible yield() {
        return new Tomato();
    }
}
