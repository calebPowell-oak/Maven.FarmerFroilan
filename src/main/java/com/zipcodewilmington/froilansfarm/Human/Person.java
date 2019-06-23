package com.zipcodewilmington.froilansfarm.Human;

import com.zipcodewilmington.froilansfarm.Generic.Animal;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;

public abstract class Person extends Animal {
    Person(String name){
        super(name);
    }

    public abstract String makeNoise();
}
