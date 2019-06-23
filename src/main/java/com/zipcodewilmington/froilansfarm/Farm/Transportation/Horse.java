package com.zipcodewilmington.froilansfarm.Farm.Transportation;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Generic.Animal;

public class Horse extends Animal implements Rideable {

    protected Horse(String name) {
        super(name);
    }

    public void eat(Edible thingToEat) {

    }

    public String makeNoise() {
        return null;
    }
}
