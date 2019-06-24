package com.zipcodewilmington.froilansfarm.Farm.Transportation;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.Field;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Farm.Produce.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Farm.RefrigeratedFoodStorage;
import com.zipcodewilmington.froilansfarm.Human.Driver;
import com.zipcodewilmington.froilansfarm.Human.Farmer;
import com.zipcodewilmington.froilansfarm.Human.Rider;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.transform.TransformerConfigurationException;

import static org.junit.Assert.*;

public class TractorTest {

    @Test
    public void operate() {
        Farm farm = new Farm();
        Tractor cropDuster = new Tractor();

        cropDuster.operate(farm);
        Farm actual = cropDuster.getCurrentFarm();

        Assert.assertEquals(farm, actual);
    }

    @Test
    public void makeNoise() {
        Tractor cropDuster = new Tractor();
        String expected = "*tractor noises*";

        String actual = cropDuster.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvest() {
        CropRow<TomatoPlant> cropRow = new CropRow<>();
        TomatoPlant tp = new TomatoPlant();
        tp.setFertilized(true);
        cropRow.getCrops().add(new TomatoPlant());
        Tractor tractor = new Tractor();
        RefrigeratedFoodStorage rfs = new RefrigeratedFoodStorage();

        tractor.harvestCrops(cropRow, rfs);

        Integer actualSize = rfs.getEdibles().size();

        Assert.assertEquals((Integer) 1, actualSize);
    }

    @Test
    public void drive(){
        Farm farm = new Farm();
        CropRow cr = new CropRow();
        TomatoPlant tp = new TomatoPlant();
        tp.setFertilized(true);
        tp.setHasBeenHarvested(false);
        cr.getCrops().add(tp);
        farm.getField().getCropRows().add(cr);
        Tractor tractor = new Tractor();
        tractor.operate(farm);
        Farmer farmer = new Farmer("Joe");
        farmer.mount(tractor);
        farmer.drive();

        Integer actual = farm.getFoodStorage().getEdibles().size();

        Assert.assertEquals((Integer) 1, actual);
    }

    @Test
    public void takeRider_trueWhenEmpty() {
        Tractor cropDuster = new Tractor();
        Farmer pilot = new Farmer("Yooo");

        Boolean result = cropDuster.takeRider(pilot);

        Assert.assertTrue(result);
    }

    @Test
    public void takePilot_falseWhenOccupied() {
        Tractor cropDuster = new Tractor();
        Farmer pilot = new Farmer("Yooo");
        Farmer pilot2 = new Farmer("Zooo");

        cropDuster.takeRider(pilot);
        Boolean result = cropDuster.takeRider(pilot2);

        Assert.assertFalse(result);
    }

    @Test
    public void takePilot_onePilotTries() {
        Tractor cropDuster = new Tractor();
        Farmer pilot = new Farmer("Yooo");

        cropDuster.takeRider(pilot);
        Rider actual = cropDuster.getCurrentDriver();

        Assert.assertEquals(pilot, actual);
    }

    @Test
    public void takePilot_twoPilotsTry() {
        Tractor cropDuster = new Tractor();
        Farmer pilot = new Farmer("Yooo");
        Farmer pilot2 = new Farmer("Zooo");

        cropDuster.takeRider(pilot);
        cropDuster.takeRider(pilot2);
        Rider actual = cropDuster.getCurrentDriver();

        Assert.assertEquals(pilot, actual);
    }
}