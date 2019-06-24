package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Mango;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MangoTreeTest {

    @Test
    public void yield() {
        MangoTree testMango = new MangoTree();
        testMango.setFertilized(true);
        testMango.setHasBeenHarvested(false);
        Edible expected = testMango.yield();

        Assert.assertTrue((Mango)expected instanceof Edible);

    }

    @Test
    public void testImplementation(){
      MangoTree testMango = new MangoTree();

        Assert.assertTrue(testMango instanceof Crop);
    }
}