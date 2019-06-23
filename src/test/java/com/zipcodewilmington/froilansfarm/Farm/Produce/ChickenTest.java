package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Pomegranate;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Tomato;
import com.zipcodewilmington.froilansfarm.Generic.Animal;
import org.junit.Assert;
import org.junit.Test;

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
        Chicken testChicken = new Chicken();

    }

    @org.junit.Test
    public void testMakeNoise() {
        //given
        Chicken testChicken = new Chicken();

        String expectedNoise = "CLUCK!";
        String actualNoise = testChicken.makeNoise();

        Assert.assertEquals(expectedNoise,actualNoise);
    }

    @Test
    public void testMakeNoise2(){
        Chicken testChicken= new Chicken();

        String expectedNoise = "Caw Caw";
        String actualNoise= testChicken.makeNoise();

        Assert.assertNotEquals(expectedNoise,actualNoise);
    }

    @Test
    public void testImplementation(){
        Chicken testChicken = new Chicken();

        Assert.assertTrue(testChicken instanceof Produce);
    }

    @Test
    public void testInheritance(){
        Chicken testChicken = new Chicken ();

        Assert.assertTrue(testChicken instanceof Animal);
    }
}