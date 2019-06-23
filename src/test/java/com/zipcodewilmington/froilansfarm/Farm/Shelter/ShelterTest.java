package com.zipcodewilmington.froilansfarm.Farm.Shelter;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Chicken;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShelterTest {

    @Test
    public void chickenGetOccupants() {

        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken1 = new Chicken();
        chickenCoop.getOccupants().add(chicken1);
        Integer actual = chickenCoop.getOccupants().size();
        Integer expected = 1;

        Assert.assertEquals(expected, actual );
    }

    @Test
    public void size(){
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken1 = new Chicken();
        chickenCoop.add(chicken1);
        Integer actual = chickenCoop.size();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void get(){
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken1 = new Chicken();
        chickenCoop.add(chicken1);
        Chicken actual = chickenCoop.get(0);
        Chicken expected = chicken1;

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void add(){
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken1 = new Chicken();
        chickenCoop.add(chicken1);
        Integer actual = chickenCoop.size();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void empty(){
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken1 = new Chicken();
        chickenCoop.add(chicken1);
        chickenCoop.empty();
        Integer actual = chickenCoop.size();
        Integer expected = 0;

        Assert.assertEquals( expected, actual);


    }


}