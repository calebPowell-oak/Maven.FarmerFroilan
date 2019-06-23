package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RefrigeratedFoodStorage {
    private Double temperature;
    private Collection<Edible> edibles = new ArrayList<>();

    public Double getTemperature(){
        return null;
    }

    public void storeStash(Collection<Edible> stash){
        edibles.addAll(stash);
    }

    public Collection<Edible> getEdibles() {
        return edibles;
    }
}
