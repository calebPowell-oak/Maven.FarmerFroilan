package com.zipcodewilmington.froilansfarm.Human;

import com.zipcodewilmington.froilansfarm.Farm.Transportation.Flyable;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Rideable;

public class Pilot extends Person implements Flier {
    Rideable currentMount;

    Pilot(String name) {
        super(name);
    }

    public void fly(Flyable flyable) {
        flyable.takePilot(this);

    }

    public void mount(Rideable rideable) {
        currentMount = rideable;
        currentMount.takeRider(this);
    }

    public void dismount() {
        currentMount = null;

    }

    @Override
    public String makeNoise() {
        return "Yeeeepiie!";
    }
}
