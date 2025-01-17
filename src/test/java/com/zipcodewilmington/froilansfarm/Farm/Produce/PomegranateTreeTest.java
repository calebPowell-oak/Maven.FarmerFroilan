package com.zipcodewilmington.froilansfarm.Farm.Produce;


import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Pomegranate;
import org.junit.Assert;
import org.junit.Test;

public class PomegranateTreeTest {


    @Test
    public void yield() {

        PomegranateTree testPomegranate = new PomegranateTree();
        testPomegranate.setFertilized(true);
        Pomegranate expected = testPomegranate.yield();

        Assert.assertTrue((expected instanceof Edible));
    }

    @Test
    public void testImplementation(){

        PomegranateTree testPomegranate = new PomegranateTree();

        Assert.assertTrue(testPomegranate instanceof Crop);
    }}