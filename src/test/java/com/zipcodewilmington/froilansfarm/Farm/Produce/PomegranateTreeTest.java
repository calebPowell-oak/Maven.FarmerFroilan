package com.zipcodewilmington.froilansfarm.Farm.Produce;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PomegranateTreeTest {

    @Test
    public void testImplementation(){

        PomegranateTree testPomegranate = new PomegranateTree();

        Assert.assertTrue(testPomegranate instanceof Crop);
    }}