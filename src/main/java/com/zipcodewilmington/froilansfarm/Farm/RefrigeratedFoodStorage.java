package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;

import java.util.Collection;

public class RefrigeratedFoodStorage<Food extends Edible> {
    private Double temperature;
    private Collection<Food> edibles;

    public Double getTemperature(){
        return null;
    }
}
