package com.zipcodewilmington.froilansfarm.Farm.Produce;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornStalkTest {

    @Test
    public void yield() {
    }

    @Test
    public void testImplementation(){
        CornStalk testCorn = new CornStalk();
        Assert.assertTrue(testCorn instanceof Crop);
    }
}