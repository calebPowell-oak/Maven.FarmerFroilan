package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Tomato;

public class TomatoPlant extends Crop {

    public Tomato yield() {
        return new Tomato();
    }
}
