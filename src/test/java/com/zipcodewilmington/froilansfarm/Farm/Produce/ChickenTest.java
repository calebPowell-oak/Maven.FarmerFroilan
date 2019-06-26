package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Tomato;
import com.zipcodewilmington.froilansfarm.Generic.Animal;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @org.junit.Test
    public void yield() {
        Chicken testChicken = new Chicken();
        EdibleEgg expected = testChicken.yield();
        Assert.assertTrue(expected instanceof EdibleEgg);



    }

    @org.junit.Test
    public void eat() {
        Chicken testChicken = new Chicken();
        Tomato testTomato = new Tomato();
        testChicken.eat(testTomato);

        Assert.assertFalse(testChicken.getHungry());
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