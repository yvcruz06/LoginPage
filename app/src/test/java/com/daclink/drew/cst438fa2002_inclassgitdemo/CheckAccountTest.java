package com.daclink.drew.cst438fa2002_inclassgitdemo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckAccountTest {
    String un_test;
    String pw_test;

    @Before
    public void setup() {
        un_test = "yvonne";
        pw_test = "cruz";

        //CheckAccount inputUP = new CheckAccount(un_test, pw_test);
        //String output = inputUP.checkAccount();
    }

    @Test
    public void checkTest() {
        System.out.println("Testing checkAccount with username: "+ un_test +" and password: "+ pw_test);
        CheckAccount inputUP = new CheckAccount(un_test, pw_test);
        assertEquals("Success", inputUP.checkAccount());
    }
}
