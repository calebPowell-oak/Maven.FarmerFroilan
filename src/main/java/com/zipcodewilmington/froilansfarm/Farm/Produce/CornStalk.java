package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EarCorn;

public class CornStalk extends Crop {
    public EarCorn yield() {
        return new EarCorn();
    }
}
