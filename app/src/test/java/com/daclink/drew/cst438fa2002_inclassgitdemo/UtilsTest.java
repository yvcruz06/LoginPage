package com.daclink.drew.cst438fa2002_inclassgitdemo;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void adderTest(){
        Random random = new Random();
        int x = random.nextInt();
        int y = random.nextInt();
        assertEquals(x+y, Utils.adder(x,y));
    }

    @Test
    public void subtractorTest(){
        assertEquals(3-2, Utils.subtractor(3,2));
    }


}
