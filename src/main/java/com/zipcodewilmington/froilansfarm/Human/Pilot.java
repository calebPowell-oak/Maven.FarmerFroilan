package com.zipcodewilmington.froilansfarm.Human;

import com.zipcodewilmington.froilansfarm.Farm.Transportation.Flyable;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Rideable;

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
        if (currentMount instanceof Flyable)
            ((Flyable) currentMount).fly();
    }
}
