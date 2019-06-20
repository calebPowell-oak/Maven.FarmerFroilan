package com.zipcodewilmington.froilansfarm.ConcreteClasses;

import com.zipcodewilmington.froilansfarm.AbstractClasses.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class CornStalk extends Crop {
    public Edible yield() {
        return new EarCorn();
    }
}
