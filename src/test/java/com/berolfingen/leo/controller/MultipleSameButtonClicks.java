package com.berolfingen.leo.controller;

import org.junit.Test;

import static com.objogate.wl.swing.driver.ComponentDriver.enabled;
import static org.hamcrest.Matchers.not;

public class MultipleSameButtonClicks extends CalculatorTestCase {
    @Test
    public void multipleSum() {
        calculatorUI.clickDigitButton(0);
        calculatorUI.clickAddButton();
        calculatorUI.clickDigitButton(1);
        calculatorUI.performCalculation();
        calculatorUI.displaysNumber("1 ");
        calculatorUI.performCalculation();
        calculatorUI.displaysNumber("2 ");
        calculatorUI.performCalculation();
        calculatorUI.displaysNumber("3 ");
    }

    @Test
    public void multipleSub() {
        calculatorUI.clickDigitButton(9);
        calculatorUI.clickSubtractButton();
        calculatorUI.clickDigitButton(2);
        calculatorUI.performCalculation();
        calculatorUI.displaysNumber("7 ");
        calculatorUI.performCalculation();
        calculatorUI.displaysNumber("5 ");
        calculatorUI.performCalculation();
        calculatorUI.displaysNumber("3 ");
    }

    @Test
    public void multipleDiv() {
        calculatorUI.clickDigitButton(8);
        calculatorUI.clickDivideButton();
        calculatorUI.clickDigitButton(2);
        calculatorUI.performCalculation();
        calculatorUI.displaysNumber("4 ");
        calculatorUI.performCalculation();
        calculatorUI.displaysNumber("2 ");
        calculatorUI.performCalculation();
        calculatorUI.displaysNumber("1 ");
    }

    @Test
    public void multipleMul() {
        calculatorUI.clickDigitButton(1);
        calculatorUI.clickMultiplyButton();
        calculatorUI.clickDigitButton(2);
        calculatorUI.performCalculation();
        calculatorUI.displaysNumber("2 ");
        calculatorUI.performCalculation();
        calculatorUI.displaysNumber("4 ");
        calculatorUI.performCalculation();
        calculatorUI.displaysNumber("8 ");
    }

    @Test
    public void multipleDot() {
        calculatorUI.clickDotButton();
        calculatorUI.displaysNumber("0.");
        calculatorUI.clickDigitButton(2);
        calculatorUI.displaysNumber("0.2");
        calculatorUI.clickDotButton();
        calculatorUI.displaysNumber("0.2");
    }

    @Test
    public void multipleRoot() {
        calculatorUI.inputWithNumberButtons("16");
        calculatorUI.clickRootButton();
        calculatorUI.displaysNumber("4 ");
        calculatorUI.clickRootButton();
        calculatorUI.displaysNumber("2 ");
    }

    @Test
    public void multipleCalc() {
        calculatorUI.inputWithNumberButtons("10");
        calculatorUI.clickDivideButton();
       calculatorUI.clickDigitButton(2);
        calculatorUI.performCalculation();
        calculatorUI.displaysNumber("5 ");
        calculatorUI.clickAddButton();
        calculatorUI.performCalculation();
        calculatorUI.displaysNumber("");
    }
}
