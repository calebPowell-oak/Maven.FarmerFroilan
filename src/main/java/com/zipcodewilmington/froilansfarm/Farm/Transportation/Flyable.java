package com.zipcodewilmington.froilansfarm.Farm.Transportation;

import com.zipcodewilmington.froilansfarm.Human.Pilot;

public interface Flyable {
    Boolean takePilot(Pilot pilot); //returns true if pilot was able to get on
}
