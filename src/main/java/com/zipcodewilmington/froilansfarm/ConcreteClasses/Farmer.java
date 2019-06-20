package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import com.zipcodewilmington.froilansfarm.AbstractClasses.Crop;
import com.zipcodewilmington.froilansfarm.AbstractClasses.Person;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Driveable;
import com.zipcodewilmington.froilansfarm.Interfaces.Driver;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Farmer extends Person implements Driver, Botanist {
    public void drive(Driveable driveable) {

    }

    public void mount(Rideable rideable) {

    }

    public void dismount() {

    }

    public void plant(Crop c, CropRow cr) {

    }
}
