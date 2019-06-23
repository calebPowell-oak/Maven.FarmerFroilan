package com.zipcodewilmington.froilansfarm.Farm.Transportation;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zipcodewilmington.froilansfarm.Human.Rider;

public interface Rideable {
    Boolean takeRider(Rider rider); //returns true if rider was able to get on
    void dismount();
}
