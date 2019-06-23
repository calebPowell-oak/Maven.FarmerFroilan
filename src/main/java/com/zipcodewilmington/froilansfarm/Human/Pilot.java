package com.zipcodewilmington.froilansfarm.Human;

import com.zipcodewilmington.froilansfarm.Farm.Transportation.Flyable;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Rideable;

public class Pilot extends Person implements Flier {

    public Pilot(String name) {
        super(name);
    }

    public void fly(Flyable flyable) {

    }

    public void mount(Rideable rideable) {

    }

    public void dismount() {

    }

    @Override
    public String makeNoise() {
        return "Yeeeepiie!";
    }
}
