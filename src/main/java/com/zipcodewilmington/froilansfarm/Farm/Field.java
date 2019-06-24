package com.zipcodewilmington.froilansfarm.Farm;

import java.util.ArrayList;
import java.util.Collection;

public class Field {
    Collection<CropRow> cropRows = new ArrayList<>();

    public Collection<CropRow> getCropRows() {
        return cropRows;
    }
}
