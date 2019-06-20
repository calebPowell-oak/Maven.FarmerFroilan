package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken implements Produce {
    private Boolean isFertilized;

    public Edible yield(){
        return new EdibleEgg();
    }
}
