package com.zipcodewilmington.froilansfarm.Human;

import com.zipcodewilmington.froilansfarm.Farm.Transportation.Horse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PilotTest {
    Pilot pilot;

    @Before
    public void setup() { pilot = new Pilot("John"); }

    @Test
    public void fly() {
    }

    @Test
    public void mountHorse() {
        Horse expected = new Horse("Horse 1");
        pilot.mount(expected);
        Assert.assertEquals(expected,pilot.getCurrentMount());
    }

    @Test
    public void mountHorseRiderTest() {
        Horse expected = new Horse("Horse 1");
        pilot.mount(expected);
        Assert.assertEquals(pilot, expected.getCurrentRider());
    }

    @Test
    public void dismount() {
        pilot.mount(new Horse("Horse 1"));
        pilot.dismount();
        Assert.assertNull(pilot.getCurrentMount());
    }

    @Test
    public void dismountRiderTest() {
        Horse expected = new Horse("Horse 1");
        pilot.mount(expected);
        pilot.dismount();
        Assert.assertNull(expected.getCurrentRider());

    }


    @Test
    public void makeNoise() {
        Assert.assertEquals("Yeeeepiie!",pilot.makeNoise());
    }
}