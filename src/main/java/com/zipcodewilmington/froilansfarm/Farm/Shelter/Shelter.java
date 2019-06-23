package com.zipcodewilmington.froilansfarm.Farm.Shelter;

import com.zipcodewilmington.froilansfarm.Generic.Animal;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Shelter<T extends Animal> {


    private Collection<T> occupants = new ArrayList<T>();


    public Collection<T> getOccupants() {


        return occupants;
    }


    public Integer size(){

        return occupants.size();
    }



    public void add(T animal){

        occupants.add(animal);

    }

    public void empty(){

        occupants.clear();
    }

    public T get(Integer index){



        return ((ArrayList<T>)occupants).get(index);

    }



}

