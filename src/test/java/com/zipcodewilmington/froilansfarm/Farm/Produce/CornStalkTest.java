package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test
    public void yield() {

        CornStalk testCorn = new CornStalk();
        testCorn.setFertilized(true);
        EarCorn expected = testCorn.yield();

        Assert.assertTrue(expected instanceof EarCorn);
    }

    @Test
    public void testImplementation(){
        CornStalk testCorn = new CornStalk();
        Assert.assertTrue(testCorn instanceof Crop);
    }
}