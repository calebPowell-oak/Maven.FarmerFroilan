package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Guava;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuavaTreeTest {

    @Test
    public void testYield(){

        GuavaTree testGuava = new GuavaTree();
        testGuava.setFertilized(true);
        testGuava.setHasBeenHarvested(false);
        Edible expected = testGuava.yield();

        Assert.assertTrue(expected instanceof Guava);
    }

    @Test
    public void testImplementation(){

    GuavaTree testGuava = new GuavaTree();

        Assert.assertTrue(testGuava instanceof Crop);

    }}