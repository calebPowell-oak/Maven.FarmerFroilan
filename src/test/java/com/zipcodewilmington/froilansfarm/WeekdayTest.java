package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Chicken;
import com.zipcodewilmington.froilansfarm.Farm.Produce.CornStalk;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Tomato;
import com.zipcodewilmington.froilansfarm.Farm.Produce.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Farm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Farm.Shelter.Stable;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.CropDuster;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Horse;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Tractor;
import com.zipcodewilmington.froilansfarm.Human.Farmer;
import com.zipcodewilmington.froilansfarm.Human.Pilot;
import org.junit.Assert;
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

    @Test
    public void sunday() {
        everyDayTask();
        Assert.assertFalse(froilan.getHungry());
        Assert.assertFalse(froilanda.getHungry());
    }

    @Test
    public void monday() {
        everyDayTask();
        Assert.assertFalse(froilan.getHungry());
        Assert.assertFalse(froilanda.getHungry());
    }
    @Test
    public void tuesday() {
        setUpForTuesday();
        everyDayTask();
        tractor.operate(farm);
        froilan.mount(tractor);
        froilan.drive();
        froilan.dismount();
        for(CropRow row : farm.getField().getCropRows())
            for(Object crop : row.getCrops())
                Assert.assertTrue(((Crop) crop).getHasBeenHarvested());
        Assert.assertFalse(froilan.getHungry());
        Assert.assertFalse(froilanda.getHungry());
    }
    @Test
    public void wednesday() {
        everyDayTask();
        Assert.assertFalse(froilan.getHungry());
        Assert.assertFalse(froilanda.getHungry());
    }
    @Test
    public void thursday() {
        everyDayTask();
        Assert.assertFalse(froilan.getHungry());
        Assert.assertFalse(froilanda.getHungry());
    }
    @Test
    public void friday() {
        everyDayTask();
        Assert.assertFalse(froilan.getHungry());
        Assert.assertFalse(froilanda.getHungry());
    }
    @Test
    public void saturday() {
        everyDayTask();
        Assert.assertFalse(froilan.getHungry());
        Assert.assertFalse(froilanda.getHungry());
    }

    public void setUpForTuesday() {
        froilan.plant(new CornStalk(),farm.getField().getCropRows().get(0));
        froilan.plant(new TomatoPlant(),farm.getField().getCropRows().get(1));
        cropDuster.operate(farm);
        froilanda.mount(cropDuster);
        froilanda.fly();
        froilanda.dismount();
    }
}
