package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Chicken;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Tomato;
import com.zipcodewilmington.froilansfarm.Farm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Farm.Shelter.Stable;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.CropDuster;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Horse;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Tractor;
import com.zipcodewilmington.froilansfarm.Human.Farmer;
import com.zipcodewilmington.froilansfarm.Human.Pilot;
import org.junit.Before;
import org.junit.Test;

public class WeekdayTest {
    Farm farm = new Farm();
    Farmer froilan = new Farmer("Froilan");
    Pilot froilanda = new Pilot("Froilanda");
    Tractor tractor = new Tractor();
    CropDuster cropDuster = new CropDuster();

    @Before
    public void setUp() {
        farm.getFarmhouse().add(froilan);
        farm.getFarmhouse().add(froilanda);
        setUpAnimal();
        setUpFoodStorage();
        for(int i = 0; i < 5; i++)
            farm.getField().getCropRows().add(new CropRow());

    }

    private void setUpFoodStorage() {
        for(int i = 0; i < 35; i++){
            farm.getFoodStorage().getEdibles().add(new EarCorn());
            farm.getFoodStorage().getEdibles().add(new Tomato());
            farm.getFoodStorage().getEdibles().add(new EdibleEgg());
        }
    }


    private void setUpAnimal() {
        farm.getChickenCoops().add(new ChickenCoop());
        for (int i = 1; i <= 15; i++)
            farm.getChickenCoops().get(0).add(new Chicken("Chicken " +i));
        farm.getStables().add(new Stable());
        for (int i = 1; i <= 10; i++)
            farm.getStables().get(0).add(new Horse("Horse " +i));

    }
    
    public void everyDayTask() {
        for(Chicken chicken : farm.getChickenCoops().get(0).getOccupants())
            froilan.feed(farm.getFoodStorage(), chicken);
        for(Horse horse: farm.getStables().get(0).getOccupants())
            froilan.feed(farm.getFoodStorage(), horse);

        froilan.feed(farm.getFoodStorage(),froilan);
        froilanda.feed(farm.getFoodStorage(),froilanda);
    }
}
