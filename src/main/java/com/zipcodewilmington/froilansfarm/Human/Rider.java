package com.zipcodewilmington.froilansfarm.Human;

import com.zipcodewilmington.froilansfarm.Farm.Transportation.Rideable;

public interface Rider <Mount extends Rideable> {
    void mount(Mount rideable);
    void dismount();
    Mount getCurrentMount();
}
