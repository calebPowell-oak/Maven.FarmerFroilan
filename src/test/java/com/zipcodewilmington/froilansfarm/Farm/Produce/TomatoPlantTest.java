package com.zipcodewilmington.froilansfarm.Farm.Produce;


import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Tomato;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomatoPlantTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void yield() {
        //check if new tomato is created
        //given
        TomatoPlant testTomato = new TomatoPlant();
        testTomato.setFertilized(true);
        testTomato.setHasBeenHarvested(false);
        Edible expected = testTomato.yield();
        System.out.println(expected);
        Assert.assertTrue(((Tomato)expected instanceof Edible));


    }

    @Test
    public void testImplementation(){
        TomatoPlant testTomato = new TomatoPlant();

        Assert.assertTrue(testTomato instanceof Crop);
    }
}