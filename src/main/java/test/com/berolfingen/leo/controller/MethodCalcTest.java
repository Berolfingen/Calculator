package com.berolfingen.leo.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class MethodCalcTest {

    @Test
    public void testSumMinDivMul() throws Exception {
        double res = MethodCalc.sumMinDivMul(1, 2, "+");
        assertEquals(3, res, 0.01);
    }

    @Test
    public void testSquareRoot() throws Exception {

    }
}