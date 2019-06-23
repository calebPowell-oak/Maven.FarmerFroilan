package com.zipcodewilmington.froilansfarm.Farm.Transportation;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Farm.RefrigeratedFoodStorage;
import com.zipcodewilmington.froilansfarm.Human.Driver;

public class Tractor implements FarmVehicle, Driveable {
    private Driver currentDriver;
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
    public Boolean takeDriver(Driver driver) {
        if(currentDriver == null){
            currentDriver = driver;
            return true;
        } else {
            return false;
        }
    }

    public void dismount(){
        currentDriver = null;
    }

    public Driver getCurrentDriver() {
        return currentDriver;
    }

    public Farm getCurrentFarm() {
        return currentFarm;
    }
}
