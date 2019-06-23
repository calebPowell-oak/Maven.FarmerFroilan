package com.zipcodewilmington.froilansfarm.Human;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Produce.CornStalk;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Farm.RefrigeratedFoodStorage;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Horse;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmerTest {
    Farmer farmer;

    @Before
    public void setup() {
        farmer = new Farmer("John");
    }

    @Test
    public void makeNoise() {
        Assert.assertEquals("Hey yo!",farmer.makeNoise());
    }

    @Test
    public void drive() {
        Tractor expected = new Tractor();
        farmer.drive(expected);
    }

    @Test
    public void mountHorse() {
        Horse expected = new Horse("Horse 1");
        farmer.mount(expected);
        Assert.assertEquals(expected,farmer.getCurrentMount());
    }

    @Test
    public void mountHorseRiderTest() {
        Horse expected = new Horse("Horse 1");
        farmer.mount(expected);
        Assert.assertEquals(farmer, expected.getCurrentRider());
    }

    @Test
    public void dismount() {
        farmer.mount(new Horse("Horse 1"));
        farmer.dismount();
        Assert.assertNull(farmer.getCurrentMount());
    }

    @Test
    public void dismountRiderTest() {
        Horse expected = new Horse("Horse 1");
        farmer.mount(expected);
        farmer.dismount();
        Assert.assertNull(expected.getCurrentRider());

    }

    @Test
    public void plant_instanceOfCorrectCrop(){
        CornStalk c = new CornStalk();
        CropRow cr = new CropRow();

        farmer.plant(c, cr);

        Assert.assertTrue(cr.getCrops().get(0) instanceof CornStalk);
    }

    @Test
    public void plant_multiple(){
        CornStalk c = new CornStalk();
        CropRow cr = new CropRow();

        farmer.plant(c, cr);

        Assert.assertEquals(20, cr.getCrops().size());
    }

    @Test
    public void feed() {
        Horse horse = new Horse("Horse 1");
        RefrigeratedFoodStorage storage = new RefrigeratedFoodStorage();
        EarCorn expected = new EarCorn();
        storage.getEdibles().add(expected);
        Assert.assertTrue(storage.getEdibles().contains(expected));

        farmer.feed(storage,horse);
        Assert.assertFalse(storage.getEdibles().contains(expected));
    }

    @Test
    public void feedHorse() {
        Horse horse = new Horse("Horse 1");
        RefrigeratedFoodStorage storage = new RefrigeratedFoodStorage();
        EarCorn expected = new EarCorn();
        storage.getEdibles().add(expected);
        Assert.assertTrue(horse.getHungry());
        farmer.feed(storage,horse);
        Assert.assertFalse(horse.getHungry());
    }

    @Test
    public void feedHorseEatHistory() {
        Horse horse = new Horse("Horse 1");
        RefrigeratedFoodStorage storage = new RefrigeratedFoodStorage();
        EarCorn expected = new EarCorn();
        storage.getEdibles().add(expected);
        Assert.assertFalse(horse.getThingsAteForTheDay().contains(expected));
        farmer.feed(storage,horse);
        Assert.assertTrue(horse.getThingsAteForTheDay().contains(expected));
    }
}