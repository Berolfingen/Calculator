package com.berolfingen.leo.controller;

import org.junit.Test;

public class ExampleWhenNothingHappensTests extends CalculatorTestCase {
    @Test
    public void
    cannotEnterMultipleLeadingZeros() {
        calculatorUI.displaysNumber("");

        calculatorUI.clickDigitButton(0);
        calculatorUI.clickDigitButton(0);
        calculatorUI.displaysNumber("0");

        calculatorUI.clickDigitButton(1);
        calculatorUI.displaysNumber("1");
    }
}