package com.zipcodewilmington.froilansfarm.Farm.Produce;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MangoTreeTest {

    @Test
    public void yield() {
    }

    @Test
    public void testImplementation(){
      MangoTree testMango = new MangoTree();

        Assert.assertTrue(testMango instanceof Crop);
    }
}