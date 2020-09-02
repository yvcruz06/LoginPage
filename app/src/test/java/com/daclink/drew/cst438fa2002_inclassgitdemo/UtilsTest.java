package com.daclink.drew.cst438fa2002_inclassgitdemo;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class UtilsTest {

    int x;
    int y;

    @Before
    public void setup() {
        Random random = new Random();
        x = random.nextInt();
        y = random.nextInt();
    }

    @Test
    public void adderTest() {
        System.out.println("Testing adder with " + x + " and " + y);
        assertEquals(x + y, Utils.adder(x, y));
    }

    @Test
    public void subtractorTest() {
        System.out.println("Testing Subtractor with " + x + " and " + y);
        assertEquals(x - y, Utils.subtractor(x, y));
    }


}
