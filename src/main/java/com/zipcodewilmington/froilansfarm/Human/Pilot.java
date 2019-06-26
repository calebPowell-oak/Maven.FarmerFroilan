package com.zipcodewilmington.froilansfarm.Human;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Tomato;
import com.zipcodewilmington.froilansfarm.Farm.RefrigeratedFoodStorage;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Aircraft;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Rideable;
import com.zipcodewilmington.froilansfarm.Generic.Animal;

public class Pilot extends Person implements Flier {
    Rideable currentMount;

    public Pilot(String name) {
        super(name);
    }

    public void mount(Rideable rideable) {
        currentMount = rideable;
        currentMount.takeRider(this);
    }

    public void dismount() {
        currentMount.dismount();
        currentMount = null;

    }

    public Rideable getCurrentMount() {
        return currentMount;
    }


    @Override
    public String makeNoise() {
        return "Yeeeepiie!";
    }

    @Override
    public void fly() {
        if (currentMount instanceof Aircraft)
            ((Aircraft) currentMount).fly();
    }

    public void feed(RefrigeratedFoodStorage storage, Animal animal) {
        if (animal instanceof Pilot) {
            animal.eat(storage.getFirstInstanceOf(new Tomato()));
            for (int i = 0; i < 2; i++) {
                animal.eat(storage.getFirstInstanceOf(new EarCorn()));
                animal.eat(storage.getFirstInstanceOf(new EdibleEgg()));
            }
        }

    }
}
