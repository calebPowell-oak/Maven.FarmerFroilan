package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Generic.Animal;

public class Chicken extends Animal implements Produce<EdibleEgg> {
    private Boolean isFertilized;


    public Chicken(String name) {
        super(name);
    }

    public Chicken(){
        super("no name set");
    }

    public EdibleEgg yield(){ return new EdibleEgg(); }

    public void eat(Edible thingToEat) { super.eat(thingToEat);

    }

    public String makeNoise() {
        // changed from void to String
        return "CLUCK!";

    }
}
