package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.AbstractClasses.Crop;
import com.zipcodewilmington.froilansfarm.ConcreteClasses.CropRow;

public interface Botanist {
    public void plant(Crop c, CropRow cr);
}
