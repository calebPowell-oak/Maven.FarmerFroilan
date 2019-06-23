package com.zipcodewilmington.froilansfarm.Farm.Transportation;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Human.Farmer;
import com.zipcodewilmington.froilansfarm.Human.Rider;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {

    @Test
    public void eat() {
        Horse horse = new Horse();
        EarCorn e = new EarCorn();

        horse.eat(e);
        Integer actual = horse.getThingsAteForTheDay().size(); // See how much horse has eaten.

        Assert.assertEquals((Integer) 1, actual);
    }

    @Test
    public void makeNoise() {
        Horse horse = new Horse();
        String expected = "Neeeiggghh";

        String actual = horse.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void takeRider_whenNone() {
        Horse horse = new Horse();
        Rider rider = new Farmer("Steve");

        horse.takeRider(rider);
        Rider actual = horse.getCurrentRider();

        Assert.assertEquals(rider, actual);
    }

    @Test
    public void takeRider_whenOccupied() {
        Horse horse = new Horse();
        Rider rider = new Farmer("Steve");
        Rider rider2 = new Farmer("Jo");

        horse.takeRider(rider);
        horse.takeRider(rider2);
        Rider actual = horse.getCurrentRider();

        Assert.assertEquals(rider, actual);
    }

    @Test
    public void takeRider_trueWhenUnoccupied() {
        Horse horse = new Horse();
        Rider rider = new Farmer("Steve");
        Boolean actual = horse.takeRider(rider);

        Assert.assertTrue(actual);
    }

    @Test
    public void takeRider_falseWhenOccupied() {
        Horse horse = new Horse();
        Rider rider = new Farmer("Steve");
        Rider rider2 = new Farmer("Jo");

        horse.takeRider(rider);
        horse.takeRider(rider2);
        Boolean actual = horse.takeRider(rider2);

        Assert.assertFalse(actual);
    }
}