package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Farm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Farm.Shelter.Farmhouse;
import com.zipcodewilmington.froilansfarm.Farm.Shelter.Stable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Farm {
    Farmhouse fh = new Farmhouse();
    List<Stable> stables = new ArrayList<>();
    List<ChickenCoop> chickenCoops = new ArrayList<>();
    RefrigeratedFoodStorage foodStorage = new RefrigeratedFoodStorage();
    Field field = new Field();

    public RefrigeratedFoodStorage getFoodStorage() {
        return foodStorage;
    }

    public Field getField() {
        return field;
    }

    public Farmhouse getFarmhouse() {
        return fh;
    }

    public List<Stable> getStables() {
        return stables;
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }
}
