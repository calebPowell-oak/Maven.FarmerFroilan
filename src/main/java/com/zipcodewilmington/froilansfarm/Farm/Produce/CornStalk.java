package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;

public class CornStalk extends Crop {
    public Edible yield() {
        return new EarCorn();
    }
}
