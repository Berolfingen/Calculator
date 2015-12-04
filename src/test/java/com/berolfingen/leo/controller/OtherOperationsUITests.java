package com.berolfingen.leo.controller;

import org.junit.Test;

public class OtherOperationsUITests extends CalculatorTestCase {
    @Test
    public void canAddGetCosinus() {
        calculatorUI.inputWithNumberButtons("90");
        calculatorUI.displaysNumber("90");
        calculatorUI.clickCosButton();
        calculatorUI.displaysNumber("0 ");
    }

    @Test
    public void canAddGetSinus() {
        calculatorUI.inputWithNumberButtons("0");
        calculatorUI.displaysNumber("0");
        calculatorUI.clickSinButton();
        calculatorUI.displaysNumber("0 ");
    }

    @Test
    public void canAddGetLog() {
        calculatorUI.inputWithNumberButtons("1000");
        calculatorUI.displaysNumber("1000");
        calculatorUI.clickLogButton();
        calculatorUI.displaysNumber("3 ");
    }
}
