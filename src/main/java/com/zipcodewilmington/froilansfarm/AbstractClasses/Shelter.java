package com.zipcodewilmington.froilansfarm.AbstractClasses;

import java.util.Collection;

public abstract class Shelter<T> {
    private Collection<T> occupants;

    public Collection<T> getOccupants() {
        return occupants;
    }
}
