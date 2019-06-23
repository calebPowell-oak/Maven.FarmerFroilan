package com.zipcodewilmington.froilansfarm.Farm.Transportation;

import com.zipcodewilmington.froilansfarm.Human.Driver;
import com.zipcodewilmington.froilansfarm.Human.Rider;

public interface Driveable {
    Boolean takeDriver(Driver driver); //returns true if driver was able to get on
}
