package com.zipcodewilmington.froilansfarm.Human;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Produce.CornStalk;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Horse;
import com.zipcodewilmington.froilansfarm.Farm.Transportation.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmerTest {
    Farmer farmer;

    @Before
    public void setup() {
        farmer = new Farmer("John");
    }

    @Test
    public void drive() {
        Tractor expected = new Tractor();
        farmer.drive(expected);
    }

    @Test
    public void mountHorse() {
        Horse expected = new Horse("Horse 1");
        farmer.mount(expected);
        Assert.assertEquals(expected,farmer.getCurrentMount());
    }

    @Test
    public void mountHorseRiderTest() {
        Horse expected = new Horse("Horse 1");
        farmer.mount(expected);
        Assert.assertEquals(farmer, expected.getCurrentRider());
    }

    @Test
    public void dismount() {
        farmer.mount(new Horse("Horse 1"));
        farmer.dismount();
        Assert.assertNull(farmer.getCurrentMount());
    }

    @Test
    public void dismountRiderTest() {
        Horse expected = new Horse("Horse 1");
        farmer.mount(expected);
        farmer.dismount();
        Assert.assertNull(expected.getCurrentRider());

    }

    @Test
    public void plant() {
        CornStalk expected = new CornStalk();
        CropRow cropRow = new CropRow();

        farmer.plant(expected,cropRow);
    }
}