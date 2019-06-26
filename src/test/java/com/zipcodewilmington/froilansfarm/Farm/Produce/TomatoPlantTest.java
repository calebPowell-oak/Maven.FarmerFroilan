package com.zipcodewilmington.froilansfarm.Farm.Produce;


import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void yield() {
        //check if new tomato is created
        //given
        TomatoPlant testTomato = new TomatoPlant();
        testTomato.setFertilized(true);
        Tomato expected = testTomato.yield();

        Assert.assertTrue((expected instanceof Tomato));


    }

    @Test
    public void testImplementation(){
        TomatoPlant testTomato = new TomatoPlant();

        Assert.assertTrue(testTomato instanceof Crop);
    }
}