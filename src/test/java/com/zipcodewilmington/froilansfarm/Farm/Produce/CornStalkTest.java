package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornStalkTest {

    @Test
    public void yield() {

        CornStalk testCorn = new CornStalk();
        testCorn.setFertilized(true);
        testCorn.setHasBeenHarvested(false);
        Edible expected = testCorn.yield();

        Assert.assertTrue(expected instanceof EarCorn);
    }

    @Test
    public void testImplementation(){
        CornStalk testCorn = new CornStalk();
        Assert.assertTrue(testCorn instanceof Crop);
    }
}