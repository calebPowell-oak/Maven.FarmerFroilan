package com.zipcodewilmington.froilansfarm.Human;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Driveable;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Rideable;

public class Farmer extends Person implements Driver, Botanist {
    private Rideable currentMount;

    public Farmer(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Hey yo!";
    }

    public void drive(Driveable driveable) {


    }

    public void mount(Rideable rideable) {
        currentMount = rideable;
        currentMount.takeRider(this);

    }

    public void dismount() {
        currentMount = null;
    }

    public void plant(Crop c, CropRow cr) {


    }

    public Rideable getCurrentMount() {
        return currentMount;
    }
}
