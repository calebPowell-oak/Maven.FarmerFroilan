package com.zipcodewilmington.froilansfarm.Farm.Transportation;

import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Human.Driver;

public class Tractor implements FarmVehicle, Driveable {
    private Driver currentDriver;
    private Farm currentFarm;

    public void operate(Farm farm) {
        currentFarm = farm;
    }

    public String makeNoise() {
        return null;
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
}
