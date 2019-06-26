package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Guava;
import org.junit.Assert;
import org.junit.Test;

public class GuavaTreeTest {

    @Test
    public void testYield(){
        GuavaTree testGuava = new GuavaTree();
        testGuava.setFertilized(true);
        Guava expected = testGuava.yield();

        Assert.assertTrue(expected instanceof Guava);
    }

    @Test
    public void testImplementation(){
        GuavaTree testGuava = new GuavaTree();
        Assert.assertTrue(testGuava instanceof Crop);
    }
}