package com.mycompany.app;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Hillel on 13.07.2017.
 */
public class XbonacciTest {

    private Xbonacci xbonacci;

    @Before
    public void setUp() throws Exception
    {
        xbonacci = new Xbonacci();
        System.out.println("SetUp");
    }

    @Test
    public void testPlus() throws Exception {
        assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, xbonacci.tribonacci(new double []{1,1,1},10));
        assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, xbonacci.tribonacci(new double []{0,0,1},10));
        assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, xbonacci.tribonacci(new double []{0,1,1},10));
    }
    private void assertArrayEquals(double []expecteds, double[] actuals) {
        for(int i = 0; i < actuals.length; i++)
            assertEquals(expecteds[i], actuals[i], 1e-10);
    }

}