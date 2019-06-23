package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Generic.Animal;

public class Chicken extends Animal implements Produce {
    private Boolean isFertilized;

    protected Chicken(String name) {
        super(name);
    }

    public EdibleEgg yield(){

            return new EdibleEgg();
    }

    public void eat(Edible thingToEat) {
        // chicken + thingto eat
        // shelter minus thing to eat

    }

    public String makeNoise() {
        // changed from void to String
        return "CLUCK!";

    }
}
