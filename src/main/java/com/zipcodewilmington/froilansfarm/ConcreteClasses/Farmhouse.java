package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import com.zipcodewilmington.froilansfarm.AbstractClasses.Person;
import com.zipcodewilmington.froilansfarm.AbstractClasses.Shelter;

import java.util.Collection;

public class Farmhouse extends Shelter<Person> {
    Collection<Person> peopleInFarmhouse;
}
