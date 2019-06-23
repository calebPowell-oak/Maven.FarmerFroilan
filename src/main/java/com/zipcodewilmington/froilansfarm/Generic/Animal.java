package com.zipcodewilmington.froilansfarm.Generic;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements Eater, NoiseMaker {
    String name;
    List<Edible> thingsAteForTheDay;
    Boolean isHungry;

    protected Animal(String name){
        this.name = name;
        thingsAteForTheDay = new ArrayList<>();
        isHungry = true;
    }

    public void eat(Edible thingToEat) {
        thingsAteForTheDay.add(thingToEat);
        isHungry = false;
    }

    public void sleep() {
        thingsAteForTheDay.clear();
        isHungry = true;
    }

    public String summary(){
        StringBuilder summary = new StringBuilder(name + " ate ");
        for(Edible food: thingsAteForTheDay)
            summary.append(food).append("\n");
        summary.append("for the day.");
        return summary.toString();
    }

    public String getName() {
        return name;
    }

    public List<Edible> getThingsAteForTheDay() {
        return thingsAteForTheDay;
    }

    public Boolean getHungry() {
        return isHungry;
    }
}
