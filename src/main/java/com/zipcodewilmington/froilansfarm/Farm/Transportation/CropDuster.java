package com.zipcodewilmington.froilansfarm.Farm.Transportation;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Human.Pilot;

public class CropDuster implements FarmVehicle, Flyable {
    private Pilot currentPilot;
    private Farm currentFarm;

    public void operate(Farm farm) {
        currentFarm = farm;
    }

    public String makeNoise() {
        return "Crop duster is making lots of Noise!";
    }

    public void fertilize(CropRow cropRow){
        cropRow.fertilize();
    }

    @Override
    public Boolean takePilot(Pilot pilot) {
        if(currentPilot == null){
            currentPilot = pilot;
            return true;
        } else {
            return false;
        }
    }
}
