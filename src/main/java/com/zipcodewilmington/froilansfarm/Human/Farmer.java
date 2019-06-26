package com.zipcodewilmington.froilansfarm.Human;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Chicken;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Tomato;
import com.zipcodewilmington.froilansfarm.Farm.RefrigeratedFoodStorage;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Horse;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Rideable;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Tractor;
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

    public void mount(Rideable rideable) {
        currentMount = rideable;
        currentMount.takeRider(this);

    }

    public void dismount() {
        currentMount.dismount();
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
            for (int i = 0; i < 3; i++)
                animal.eat(storage.getFirstInstanceOf(new EarCorn()));
        else if (animal instanceof Chicken)
            animal.eat(storage.getFirstInstanceOf(new Tomato()));
        else if (animal instanceof Farmer) {
            animal.eat(storage.getFirstInstanceOf(new EarCorn()));
            for (int i = 0; i < 2; i++)
                animal.eat(storage.getFirstInstanceOf(new Tomato()));
            for (int i = 0; i < 5; i++)
                animal.eat(storage.getFirstInstanceOf(new EdibleEgg()));
        }
    }

    @Override
    public void drive() {
        if(currentMount instanceof Tractor)
            ((Tractor) currentMount).drive();
    }
}
