package com.zipcodewilmington.froilansfarm.Farm.Transportation;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Generic.Animal;
import com.zipcodewilmington.froilansfarm.Human.Rider;

public class Horse extends Animal implements Rideable {

    private Rider currentRider;

    public Horse(String name) {
        super(name);
        currentRider = null;

    }

    public Horse(){
        super("no name set");
        currentRider = null;
    }

    public void eat(EarCorn cornToEat) {
        super.eat(cornToEat);
    }

    public String makeNoise() {
        return "Neeeiggghh";
    }

    @Override
    public Boolean takeRider(Rider rider) {
        if(currentRider == null){
            currentRider = rider;
            return true;
        } else {
            return false;
        }
    }

    public Rider getCurrentRider() {
        return currentRider;
    }
}
