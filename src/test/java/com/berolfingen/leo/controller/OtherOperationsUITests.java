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
}
