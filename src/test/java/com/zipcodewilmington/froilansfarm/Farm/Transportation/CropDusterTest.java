package com.zipcodewilmington.froilansfarm.Farm.Transportation;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Farm.Produce.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Human.Pilot;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropDusterTest {

    @Test
    public void operate() {
        Farm farm = new Farm();
        CropDuster cropDuster = new CropDuster();

        cropDuster.operate(farm);
        Farm actual = cropDuster.getCurrentFarm();

        Assert.assertEquals(farm, actual);
    }

    @Test
    public void makeNoise() {
        CropDuster cropDuster = new CropDuster();
        String expected = "*airplane noises*";

        String actual = cropDuster.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fertilize() {
        CropRow<TomatoPlant> cropRow = new CropRow<>();
        CropDuster cropDuster = new CropDuster();

        cropDuster.fertilize(cropRow);
        Boolean actual = cropRow.getFertilized();

        Assert.assertTrue(actual);
    }

    @Test
    public void takePilot_trueWhenEmpty() {
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot("Yooo");

        Boolean result = cropDuster.takePilot(pilot);

        Assert.assertTrue(result);
    }

    @Test
    public void takePilot_falseWhenOccupied() {
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot("Yooo");
        Pilot pilot2 = new Pilot("Zooo");

        cropDuster.takePilot(pilot);
        Boolean result = cropDuster.takePilot(pilot2);


        Assert.assertFalse(result);
    }

    @Test
    public void takePilot_onePilotTries() {
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot("Yooo");

        cropDuster.takePilot(pilot);
        Pilot actual = cropDuster.getCurrentPilot();

        Assert.assertEquals(pilot, actual);
    }

    @Test
    public void takePilot_twoPilotsTry() {
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot("Yooo");
        Pilot pilot2 = new Pilot("Zooo");

        cropDuster.takePilot(pilot);
        cropDuster.takePilot(pilot2);
        Pilot actual = cropDuster.getCurrentPilot();

        Assert.assertEquals(pilot, actual);
    }
}