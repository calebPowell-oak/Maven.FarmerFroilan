package com.zipcodewilmington.froilansfarm.Farm.Transportation;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Human.Pilot;
import com.zipcodewilmington.froilansfarm.Human.Rider;

public class CropDuster implements FarmVehicle, Flyable, Rideable {
    private Rider currentRider;
    private Farm currentFarm;

    public void operate(Farm farm) {
        currentFarm = farm;
    }

    public String makeNoise() {
        return "*airplane noises*";
    }

    public void fertilize(CropRow cropRow){
        cropRow.fertilize();
    }

    @Override
    public Boolean takeRider(Rider rider) {
        if(currentRider == null){
            currentRider = rider;
            return true;
        } else {
            return false;
        }
    }

    public void dismount(){
        currentRider = null;
    }

    public Rider getCurrentPilot() {
        return currentRider;
    }

    public Farm getCurrentFarm() {
        return currentFarm;
    }

    @Override
    public void fly() {
        // for each croprow in field in farm
        for(CropRow row : currentFarm.getField().getCropRows()){
            fertilize(row);
        }
    }
}
