package com.zipcodewilmington.froilansfarm.Human;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Farm.RefrigeratedFoodStorage;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Driveable;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Horse;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Rideable;
import com.zipcodewilmington.froilansfarm.Generic.Animal;

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
        driveable.takeDriver(this);
    }

    public void mount(Rideable rideable) {
        currentMount = rideable;
        currentMount.takeRider(this);

    }

    public void dismount() {
        currentMount = null;
    }

    public void plant(Crop c, CropRow cr) {
        cr.getCrops().add(c);

    }

    public Rideable getCurrentMount() {
        return currentMount;
    }

    public void feed(RefrigeratedFoodStorage storage, Animal animal){
        if (animal instanceof Horse)
            animal.eat(storage.getFirstInstanceOf(new EarCorn()));
    }
}
