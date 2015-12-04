package com.berolfingen.leo.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class MethodCalcTest {

    @Test
    public void testChooseOperation() throws Exception {
        double result = MethodCalc.chooseOperation(1, 1, "+");
        assertEquals(2, result, 0.01);
    }

    @Test
    public void testChooseOperation1() throws Exception {
        double result = MethodCalc.chooseOperation(1, 1, "-");
        assertEquals(0, result, 0.01);
    }

    @Test
    public void testChooseOperation2() throws Exception {
        double result = MethodCalc.chooseOperation(1, 1, "/");
        assertEquals(1, result, 0.01);
    }

    @Test
    public void testChooseOperation3() throws Exception {
        double result = MethodCalc.chooseOperation(1, 1, "*");
        assertEquals(1, result, 0.01);
    }

    @Test
    public void testSum() {
        double result = MethodCalc.sum(15, -15);
        assertEquals(0, result, 0.01);
    }

    @Test
    public void testSum1() {
        double result = MethodCalc.sum(Double.MAX_VALUE, Double.MAX_VALUE);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.01);
    }

    @Test
    public void testMinus() {
        double result = MethodCalc.minus(120, -50);
        assertEquals(170, result, 0.01);
    }

    @Test
    public void testMinus1() {
        double result = MethodCalc.minus(-Double.MAX_VALUE, Double.MAX_VALUE);
        assertEquals(Double.NEGATIVE_INFINITY, result, 0.01);
    }

    @Test
    public void testDivide() throws Exception {
        double result = MethodCalc.divide(15, -7.5);
        assertEquals(-2, result, 0.01);
    }

    @Test(expected = NumberFormatException.class)
    public void testDivide1() throws Exception {
        double result = MethodCalc.divide(15, 0);
    }

    @Test
    public void testMultiple() {
        double result = MethodCalc.multiple(14, 2);
        assertEquals(28, result, 0.01);
    }

    @Test
    public void testMultiple1() {
        double result = MethodCalc.multiple(0, 2);
        assertEquals(0, result, 0.01);
    }

    @Test
    public void testMultiple2() {
        double result = MethodCalc.multiple(Double.MAX_VALUE, 2);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.01);
    }

    @Test
    public void testSquareRoot() throws Exception {
        double result = MethodCalc.squareRoot(16);
        assertEquals(4, result, 0.01);
    }

    @Test(expected = NumberFormatException.class)
    public void testSquareRoot1() throws Exception {
        double result = MethodCalc.squareRoot(-1);
    }

    @Test
    public void testCos() {
        double result = MethodCalc.cos(0);
        assertEquals(1, result, 0.01);
    }

    @Test
    public void testCos1() {
        double result = MethodCalc.cos(180);
        assertEquals(-1, result, 0.01);
    }

    @Test
    public void testCos2() {
        double result = MethodCalc.cos(90);
        assertEquals(0, result, 0.01);
    }

    @Test
    public void testSin() {
        double result = MethodCalc.sin(0);
        assertEquals(0, result, 0.01);
    }

    @Test
    public void testSin1() {
        double result = MethodCalc.sin(90);
        assertEquals(1, result, 0.01);
    }

    @Test
    public void testSin2() {
        double result = MethodCalc.sin(270);
        assertEquals(-1, result, 0.01);
    }

    @Test
    public void testLog() {
        double result = MethodCalc.log(100);
        assertEquals(2, result, 0.01);
    }

    @Test(expected = NumberFormatException.class)
    public void testLog1() throws Exception {
        double result = MethodCalc.log(-1);
    }

    @Test(expected = NumberFormatException.class)
    public void testLog2() throws Exception {
        double result = MethodCalc.log(0);
    }
}

