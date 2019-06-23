package com.zipcodewilmington.froilansfarm.Farm.Transportation;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.RefrigeratedFoodStorage;
import com.zipcodewilmington.froilansfarm.Human.Driver;
import com.zipcodewilmington.froilansfarm.Human.Rider;

public class Tractor implements FarmVehicle, Driveable, Rideable {
    private Rider currentRider;
    private Farm currentFarm;

    public void operate(Farm farm) {
        currentFarm = farm;
    }

    public String makeNoise() {
        return "*tractor noises*";
    }

    public void harvestCrops(CropRow cropRow, RefrigeratedFoodStorage storage){
         storage.storeStash(cropRow.harvestCrops());
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

    public Rider getCurrentDriver() {
        return currentRider;
    }

    public Farm getCurrentFarm() {
        return currentFarm;
    }

    @Override
    public void drive() {
        //
    }
}
