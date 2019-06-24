package com.zipcodewilmington.froilansfarm.Farm.Transportation;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Generic.Animal;
import com.zipcodewilmington.froilansfarm.Human.Rider;

public class Horse extends Animal implements Rideable {

    private Rider currentRider;
    private Boolean hasBeenRidden;

    @Override
    public void sleep(){
        thingsAteForTheDay.clear();
        isHungry = true;
        hasBeenRidden = false;
    }

    public Horse(String name) {
        super(name);
        currentRider = null;
        hasBeenRidden = false;
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
            hasBeenRidden = true;
            return true;
        } else {
            return false;
        }
    }

    public void dismount(){
        currentRider = null;
    }

    public Rider getCurrentRider() {
        return currentRider;
    }

    public Boolean getHasBeenRidden() {
        return hasBeenRidden;
    }
}
