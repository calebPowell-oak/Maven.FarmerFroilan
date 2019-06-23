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
        //plant 20 of a particular crop in a row
        Class cropClass = c.getClass();
        for(int i = 0; i < 20; i++){
            try {
                cr.getCrops().add(cropClass.newInstance());
            } catch (Exception e){
                e.printStackTrace(System.out);
            }
        }
    }

    public Rideable getCurrentMount() {
        return currentMount;
    }

    public void feed(RefrigeratedFoodStorage storage, Animal animal){
        if (animal instanceof Horse)
            animal.eat(storage.getFirstInstanceOf(new EarCorn()));
    }
}
