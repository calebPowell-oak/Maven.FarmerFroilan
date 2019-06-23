package com.zipcodewilmington.froilansfarm.Human;

import com.zipcodewilmington.froilansfarm.Farm.Transportation.Rideable;

public interface Rider {
    void mount(Rideable rideable);
    void dismount();
    Rideable getCurrentMount();
}
