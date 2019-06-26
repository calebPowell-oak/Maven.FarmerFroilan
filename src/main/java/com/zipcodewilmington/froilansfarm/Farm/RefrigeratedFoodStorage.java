package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RefrigeratedFoodStorage {
    private Double temperature;
    private List<Edible> edibles = new ArrayList<>();

    public Double getTemperature(){
        return null;
    }

    public void storeStash(Collection<Edible> stash){
        edibles.addAll(stash);
    }

    public List<Edible> getEdibles() {
        return edibles;
    }

    public Edible getFirstInstanceOf(Edible food){
        for(Edible item : edibles){
            if(food.getClass().equals(item.getClass())) return edibles.remove(edibles.indexOf(item));
        }
        return null;
    }
}
