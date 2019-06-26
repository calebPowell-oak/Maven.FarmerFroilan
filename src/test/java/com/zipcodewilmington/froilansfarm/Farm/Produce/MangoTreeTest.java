package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Mango;
import org.junit.Assert;
import org.junit.Test;

public class MangoTreeTest {

    @Test
    public void yield() {
        MangoTree testMango = new MangoTree();
        testMango.setFertilized(true);
        Mango expected = testMango.yield();

        Assert.assertTrue(expected instanceof Edible);

    }

    @Test
    public void testImplementation(){
      MangoTree testMango = new MangoTree();

        Assert.assertTrue(testMango instanceof Crop);
    }
}