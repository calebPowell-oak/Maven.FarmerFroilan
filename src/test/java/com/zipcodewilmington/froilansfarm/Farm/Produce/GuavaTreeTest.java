package com.zipcodewilmington.froilansfarm.Farm.Produce;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuavaTreeTest {

    @Test
    public void testYield(){}

    @Test
    public void testImplementation(){

    GuavaTree testGuava = new GuavaTree();

        Assert.assertTrue(testGuava instanceof Crop);

    }}