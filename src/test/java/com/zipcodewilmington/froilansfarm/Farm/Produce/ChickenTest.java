package com.zipcodewilmington.froilansfarm.Farm.Produce;

import org.junit.Assert;

import static org.junit.Assert.*;

public class ChickenTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void yield() {


    }

    @org.junit.Test
    public void eat() {
    }

    @org.junit.Test
    public void makeNoise() {
        //given
        Chicken testChicken = new Chicken();

        String expectedNoise = "CLUCK!";
        String actualNoise = testChicken.makeNoise();

        Assert.assertEquals(expectedNoise,actualNoise);
    }
}