package com.zipcodewilmington.froilansfarm.Farm.Transportation;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.RefrigeratedFoodStorage;
import com.zipcodewilmington.froilansfarm.Human.Rider;

public class Tractor extends Vehicle implements FarmVehicle {
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

    public void drive() {
        // for each croprow in field in farm
        for(CropRow row : currentFarm.getField().getCropRows()){
            harvestCrops(row, currentFarm.getFoodStorage());
        }
        // harvest crop in those croprow, with storage in farm
    }
}
