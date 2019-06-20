package com.zipcodewilmington.froilansfarm.Farm.Shelter;

import com.zipcodewilmington.froilansfarm.Generic.Animal;

import java.util.Collection;

public abstract class Shelter<T extends Animal> {
    private Collection<T> occupants;

    public Collection<T> getOccupants() {
        return occupants;
    }
}
