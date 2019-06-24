package com.zipcodewilmington.froilansfarm.Human;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Produce.CornStalk;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Tomato;
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

    @Test
    public void testSleep() {
        farmer.eat(new EarCorn());
        Assert.assertFalse(farmer.getHungry());
        farmer.sleep();
        Assert.assertTrue(farmer.getHungry());
    }

    @Test
    public void testSleepList() {
        EarCorn expected = new EarCorn();
        farmer.eat(expected);
        Assert.assertTrue(farmer.getThingsAteForTheDay().contains(expected));
        farmer.sleep();
        Assert.assertFalse(farmer.getThingsAteForTheDay().contains(expected));
    }

    @Test
    public void getName() {
        Assert.assertEquals("John", farmer.getName());
    }

    @Test
    public void testSummary() {
        farmer.eat(new EarCorn());
        farmer.eat(new Tomato());

        Assert.assertEquals("John ate:\nEarCorn\nTomato\nfor the day.",farmer.summary());
    }
}